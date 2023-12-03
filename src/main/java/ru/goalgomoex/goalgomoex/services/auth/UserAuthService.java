package ru.goalgomoex.goalgomoex.services.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.goalgomoex.goalgomoex.entitys.auth.UserAuthData;
import ru.goalgomoex.goalgomoex.entitys.dto.auth.UserAuthDTO;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
import ru.goalgomoex.goalgomoex.repository.auth.UserAuthRepository;
import ru.goalgomoex.goalgomoex.utils.exeption.InvalidPasswordException;
import ru.goalgomoex.goalgomoex.utils.exeption.UserAlreadyExistsException;
import ru.goalgomoex.goalgomoex.utils.exeption.UserNotFoundException;

@Service
public class UserAuthService {
    private final UserAuthRepository userAuthRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserAuthService(UserAuthRepository userAuthRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userAuthRepository = userAuthRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public dtoMessage registerUser(UserAuthDTO userAuthDTO) throws UserAlreadyExistsException {
        if (userAuthRepository.existsByUsername(userAuthDTO.getEmail())) {
            throw new UserAlreadyExistsException();
        }

        // Создаем нового пользователя
        UserAuthData newUser = new UserAuthData();
        newUser.setUsername(userAuthDTO.getEmail());
        newUser.setPassword(passwordEncoder.encode(userAuthDTO.getPassword()));

        userAuthRepository.save(newUser);

        return new dtoMessage("Success", "User registered successfully");
    }

    public dtoMessage loginUser(UserAuthDTO userAuthDTO) throws InvalidPasswordException, UserNotFoundException {
        UserAuthData existingUser = userAuthRepository.findByUsername(userAuthDTO.getEmail());

        if (existingUser != null) {
            if (passwordEncoder.matches(userAuthDTO.getPassword(), existingUser.getPassword())) {
                return new dtoMessage("Success", "User " + existingUser.getUsername() + " logged in successfully");
            } else {
                throw new InvalidPasswordException();
            }
        } else {
            throw new UserNotFoundException(userAuthDTO.getEmail());
        }
    }
    public UserAuthData findByUsername(String username) {
        return userAuthRepository.findByUsername(username);
    }

}
