package westcoastcompassdealer.demo.domain.models.binding;

import westcoastcompassdealer.demo.domain.User;
import westcoastcompassdealer.demo.domain.models.service.UserServiceModel;

public class CarCreateBindingModel {

    private String model;

    private String brand;

    private Integer year;

    private String engine;


    public CarCreateBindingModel() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


}
