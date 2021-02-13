package builderPattern.builders;

import builderPattern.cars.Car;
import builderPattern.interfaces.ICarBuilder;

public class SportsCarBuilder {

    private ICarBuilder builder;

    public SportsCarBuilder(ICarBuilder builder) {
        this.builder = builder;
    }

    public Car build() {
        builder.setModel("488 spider");
        return builder.build();
    }
}
