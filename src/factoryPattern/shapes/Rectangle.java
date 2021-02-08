package factoryPattern.shapes;

import factoryPattern.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Je suis un rectangle !");
    }
}
