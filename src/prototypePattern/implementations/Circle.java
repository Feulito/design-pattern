package prototypePattern.implementations;

import prototypePattern.enumerations.ShapeType;

public class Circle extends Shape {

    public Circle() {
        this.type = ShapeType.CIRCLE;
        this.setId(this.type.toString());
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle's draw method");
    }
}
