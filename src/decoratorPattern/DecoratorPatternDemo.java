package decoratorPattern;

import decoratorPattern.decorators.RedShapeDecorator;
import factoryPattern.factories.ShapeFactory;
import factoryPattern.interfaces.Shape;

/**
 * L'intéret du patron de conception decorator est de modifier le comportement
 * d'un objet sans altérer sa structure.
 * Ici, on modifie le comportement des shape sans modifier leur implémentation
 * de l'interface Shape
 */
public class DecoratorPatternDemo {

    /*
        On utilise ici les formes du FactoryPattern => On peut mixer les patrons de conception facilement
        On pourrait également faire une factory prennant en compte les decorator
        Il suffirait de faire une Enum pour chaque decorator et les utiliser comme des flags à
        passer en argument comme expliqué dans la 3e implémentation du FactoryPattern
    */
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getRectangle();
        Shape circle = ShapeFactory.getCircle();
        Shape square = ShapeFactory.getSquare();

        System.out.println("Sans le decorator :");
        rectangle.draw();
        circle.draw();
        square.draw();

        Shape redRectangle = new RedShapeDecorator(ShapeFactory.getRectangle());
        Shape redCircle = new RedShapeDecorator(ShapeFactory.getCircle());
        Shape redSquare = new RedShapeDecorator(ShapeFactory.getSquare());

        System.out.println("Avec un decorator : ");
        redRectangle.draw();
        redCircle.draw();
        redSquare.draw();
    }
}
