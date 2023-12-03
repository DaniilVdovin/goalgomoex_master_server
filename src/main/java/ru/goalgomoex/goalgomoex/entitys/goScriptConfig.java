package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import ru.goalgomoex.goalgomoex.entitys.IEntity;

import java.util.Date;

@Entity
@Table(name = "go_script_configs")
public class goScriptConfig implements IEntity {
    @Id
    @GeneratedValue
    private long ID;
    private String GUID;
    private int version;

    //TODO USER ID

    private long task_id;
    private String scaler_path;
    private String neural_path;
    private String ticker;
    private String timeframe;
    private Date start_date;
    private Date end_date;
    private int count_points;
    private int extr_bar_count;
    private float max_unmark;
    private int size_df;
    private int count_days;
    private String data_path;
    private boolean new_model_flag;
    private float learning_rate;
    private int epochs;
    private int steps_per_epoch;
    private int validation_steps;


    public goScriptConfig() {
    }

    @Override
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    @Override
    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void upVersion() {
        version++;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getScaler_path() {
        return scaler_path;
    }

    public void setScaler_path(String scaler_path) {
        this.scaler_path = scaler_path;
    }

    public String getNeural_path() {
        return neural_path;
    }

    public void setNeural_path(String neural_path) {
        this.neural_path = neural_path;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getCount_points() {
        return count_points;
    }

    public void setCount_points(int count_points) {
        this.count_points = count_points;
    }

    public int getExtr_bar_count() {
        return extr_bar_count;
    }

    public void setExtr_bar_count(int extr_bar_count) {
        this.extr_bar_count = extr_bar_count;
    }

    public float getMax_unmark() {
        return max_unmark;
    }

    public void setMax_unmark(float max_unmark) {
        this.max_unmark = max_unmark;
    }

    public int getSize_df() {
        return size_df;
    }

    public void setSize_df(int size_df) {
        this.size_df = size_df;
    }

    public int getCount_days() {
        return count_days;
    }

    public void setCount_days(int count_days) {
        this.count_days = count_days;
    }

    public String getData_path() {
        return data_path;
    }

    public void setData_path(String data_path) {
        this.data_path = data_path;
    }

    public boolean isNew_model_flag() {
        return new_model_flag;
    }

    public void setNew_model_flag(boolean new_model_flag) {
        this.new_model_flag = new_model_flag;
    }

    public float getLearning_rate() {
        return learning_rate;
    }

    public void setLearning_rate(float learning_rate) {
        this.learning_rate = learning_rate;
    }

    public int getEpochs() {
        return epochs;
    }

    public void setEpochs(int epochs) {
        this.epochs = epochs;
    }

    public int getSteps_per_epoch() {
        return steps_per_epoch;
    }

    public void setSteps_per_epoch(int steps_per_epoch) {
        this.steps_per_epoch = steps_per_epoch;
    }

    public int getValidation_steps() {
        return validation_steps;
    }

    public void setValidation_steps(int validation_steps) {
        this.validation_steps = validation_steps;
    }
}
