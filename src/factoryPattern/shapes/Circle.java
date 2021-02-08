package factoryPattern.shapes;

import factoryPattern.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Je suis un cercle !");
    }
}
