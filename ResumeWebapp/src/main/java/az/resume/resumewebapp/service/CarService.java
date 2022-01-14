package az.resume.resumewebapp.service;

import az.resume.resumewebapp.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    Car saveCar(Car car);
    Car carById(Long id);

}
