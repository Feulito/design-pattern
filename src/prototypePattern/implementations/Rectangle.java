package prototypePattern.implementations;

import prototypePattern.enumerations.ShapeType;

public class Rectangle extends Shape {

    public Rectangle() {
        this.type = ShapeType.RECTANGLE;
        this.setId(this.type.toString());
    }

    @Override
    public void draw() {
        System.out.println("Inside rectangle's draw method");
    }
}
