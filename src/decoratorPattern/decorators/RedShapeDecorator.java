package decoratorPattern.decorators;

import factoryPattern.interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        drawRedBorder(decoratedShape);
    }

    private void drawRedBorder(Shape decoratedShape) {
        System.out.println("Border color : Red");
    }
}
