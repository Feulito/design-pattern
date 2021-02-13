package builderPattern.builders;

import builderPattern.cars.Car;
import builderPattern.interfaces.ICarBuilder;

public class FerrariCarsBuilder implements ICarBuilder {

    private Car ferrari;
    private String model;

    @Override
    public Car build() {
        ferrari = new Car();
        ferrari.setMaker("Ferrari");
        if (model.equalsIgnoreCase("488 Spider"))
            ferrari.setModel(model).setColor("Red").setNbDoors(2);
        else throw new NullPointerException("Cette ferrari n'existe pas");
        return ferrari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
