package builderPattern;

import builderPattern.builders.FerrariCarsBuilder;
import builderPattern.builders.SportsCarBuilder;
import builderPattern.cars.Car;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        FerrariCarsBuilder builder = new FerrariCarsBuilder();
        SportsCarBuilder director = new SportsCarBuilder(builder);

        Car ferrari = director.build();
        System.out.println(ferrari);
    }
}
