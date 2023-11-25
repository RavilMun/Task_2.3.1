package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>() {{
        add(new Car("Tesla", 2021, 40000));
        add(new Car("Toyota", 2001, 2000));
        add(new Car("BMW", 1992, 2500));
        add(new Car("Lexus", 2022, 60500));
        add(new Car("Mercedes", 1999, 3000));
    }};

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
