package ru.goalgomoex.goalgomoex.controllers.api.v1.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goalgomoex.goalgomoex.entitys.dto.auth.UserAuthDTO;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
import ru.goalgomoex.goalgomoex.services.auth.UserAuthService;
import ru.goalgomoex.goalgomoex.utils.exeption.InvalidPasswordException;
import ru.goalgomoex.goalgomoex.utils.exeption.UserAlreadyExistsException;
import ru.goalgomoex.goalgomoex.utils.exeption.UserNotFoundException;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserAuthService userAuthService;

    public AuthController(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    @PostMapping("/register")
    public ResponseEntity<dtoMessage> registerUser(@RequestBody UserAuthDTO userAuthDTO) {
        try {
            dtoMessage responseMessage = userAuthService.registerUser(userAuthDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new dtoMessage("Error", "User with username " + userAuthDTO.getEmail() + " already exists."));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<dtoMessage> loginUser(@RequestBody UserAuthDTO userAuthDTO) {
        try {
            dtoMessage responseMessage = userAuthService.loginUser(userAuthDTO);
            return ResponseEntity.ok(responseMessage);
        } catch (InvalidPasswordException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new dtoMessage("Error", "Invalid password."));
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new dtoMessage("Error", "User not found with username: " + userAuthDTO.getEmail()));
        }
    }

}
