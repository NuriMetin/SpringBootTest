package az.resume.resumewebapp.controller;

import az.resume.resumewebapp.entity.Car;
import az.resume.resumewebapp.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("car")
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<Car> get(){
       return carService.getCars();
    }

    @PostMapping
    public void save(@RequestBody Car car){
        carService.saveCar(car);
    }

    @GetMapping("/getById/{id}")
    public Car getById(@PathVariable Long id){
        return carService.carById(id);
    }
}
