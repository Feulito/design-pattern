package prototypePattern.implementations;

import prototypePattern.enumerations.ShapeType;

public class Square extends Shape {

    public Square() {
        this.type = ShapeType.SQUARE;
        this.setId(this.type.toString());
    }

    @Override
    public void draw() {
        System.out.println("Inside Square's method");
    }
}
