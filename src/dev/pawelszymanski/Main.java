package dev.pawelszymanski;

import dev.pawelszymanski.builder.Car;
import dev.pawelszymanski.builder.CarBrand;

public class Main {

    public static void main(String[] args) {
        //USAGE OF BUILDER
        Car firstCar = new Car.Builder()
                .carBrand(CarBrand.AUDI)
                .doorsNumber(5)
                .modelName("A4")
                .build();

        Car secondCar = new Car.Builder()
                .doorsNumber(3)
                .horsepower(500)
                .carBrand(CarBrand.BMW)
                .build();

        System.out.println(firstCar);
        System.out.println(secondCar);
    }
}
