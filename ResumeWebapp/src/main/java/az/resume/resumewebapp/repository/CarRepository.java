package az.resume.resumewebapp.repository;

import az.resume.resumewebapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByColor(String color);

    @Query("SELECT c from Car c where c.id= :id")
    Car carBydId(Long id);
}
