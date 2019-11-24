package westcoastcompassdealer.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import westcoastcompassdealer.demo.domain.Car;
import westcoastcompassdealer.demo.domain.models.service.CarServiceModel;
import westcoastcompassdealer.demo.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final ModelMapper modelMapper;
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(ModelMapper modelMapper, CarRepository carRepository) {
        this.modelMapper = modelMapper;
        this.carRepository = carRepository;
    }


    @Override
    public CarServiceModel getByBrand(String brand) {
        return this.modelMapper.map(this.carRepository.getByBrand(brand), CarServiceModel.class);
    }

    @Override
    public void save(CarServiceModel car) {

        this.carRepository.saveAndFlush(this.modelMapper.map(car,Car.class));
    }

    @Override
    public List<CarServiceModel> getAll() {

        return this.carRepository
                .getAll()
                .stream()
                .map(car -> this.modelMapper.map(car,CarServiceModel.class))
                .collect(Collectors.toList());

    }
}
