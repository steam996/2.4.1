package web.repository;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "Red"));
        cars.add(new Car("Porsche", 2, "Black"));
        cars.add(new Car("Audi", 3, "Brown"));
        cars.add(new Car("Ford", 4, "White"));
        cars.add(new Car("Nissan", 5, "Yellow"));
    }

    public List<Car> getCars(int count) {
        if (count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
