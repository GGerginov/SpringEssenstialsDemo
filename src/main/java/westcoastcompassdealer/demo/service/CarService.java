package westcoastcompassdealer.demo.service;

import org.springframework.stereotype.Service;
import westcoastcompassdealer.demo.domain.Car;
import westcoastcompassdealer.demo.domain.models.service.CarServiceModel;

import java.util.List;

public interface CarService {

    CarServiceModel getByBrand(String brand);

    void save(CarServiceModel car);

    List<CarServiceModel> getAll();
}
