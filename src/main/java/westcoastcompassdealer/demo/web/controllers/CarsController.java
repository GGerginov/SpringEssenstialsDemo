package westcoastcompassdealer.demo.web.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import westcoastcompassdealer.demo.domain.models.CarViewModel;
import westcoastcompassdealer.demo.domain.models.binding.CarCreateBindingModel;
import westcoastcompassdealer.demo.domain.models.service.CarServiceModel;
import westcoastcompassdealer.demo.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class    CarsController extends BaseController{

    private final CarService carService;
    private final ModelMapper modelMapper;

    @Autowired
    public CarsController(CarService carService, ModelMapper modelMapper) {
        this.carService = carService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return super.view("cars/create");
    }

    @PostMapping("/create")
    public ModelAndView createConfirm(@ModelAttribute CarCreateBindingModel model){

        this.carService.save(this.modelMapper.map(model, CarServiceModel.class));

        return super.redirect("/");
    }

    @GetMapping("/all")
    public ModelAndView all(ModelAndView modelAndView) {

        List<CarViewModel> cars = new ArrayList<>(this.carService.getAll().stream().map(car -> this.modelMapper.map(car, CarViewModel.class)).collect(Collectors.toList()));

        modelAndView.addObject("cars",cars);

        modelAndView.setViewName("cars/all");

        return modelAndView;
    }





}
