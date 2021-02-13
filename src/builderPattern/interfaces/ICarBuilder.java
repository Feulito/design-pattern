package builderPattern.interfaces;

import builderPattern.cars.Car;

public interface ICarBuilder {

    Car build();
    void setModel(String model);

}
