package factoryPattern.factories;

import factoryPattern.enumerations.ShapeEnum;
import factoryPattern.interfaces.Shape;
import factoryPattern.shapes.Circle;
import factoryPattern.shapes.Rectangle;
import factoryPattern.shapes.Square;

public class ShapeFactory {

    /**
     * Méthode avec le string en paramètre
     * La méthode retourne une forme en fonction de la chaine de caractère passée en paramètre
     * @param shapeName Nom de la forme
     * @return Shape
     */
    public static Shape getShape(String shapeName) {
        assert shapeName != null;
        if (shapeName.equalsIgnoreCase("rectangle")) return new Rectangle();
        if (shapeName.equalsIgnoreCase("Square")) return new Square();
        if (shapeName.equalsIgnoreCase("Circle")) return new Circle();
        return null;
    }

    /**
     * Seconde méthode avec la méthode explicite
     * @return Shape
     */
    public static Shape getRectangle() {
        return new Rectangle();
    }

    public static Shape getSquare() {
        return new Square();
    }

    public static Shape getCircle() {
        return new Circle();
    }

    /**
     * Cette méthode ressemble à celle avec le string
     * Mais elle permet de faire des EnumSet, permettant de faire du bitFlag
     * Le paramètre serait alors EnumSet<ShapeEnum> shapes
     * Et on verifierais les flags via if (shapes.contains(ShapeEnum.Rectangle))
     * Cela permet de construire un objet selon plusieurs flags (pas utilise sur nos formes)
     * @param shape ShapeEnum décrifant la forme souhaitée
     * @return Shape
     */
    public static Shape getShape(ShapeEnum shape) {
        assert shape != null;
        if (shape == ShapeEnum.RECTANGLE) return new Rectangle();
        if (shape == ShapeEnum.SQUARE) return new Square();
        if (shape == ShapeEnum.CIRCLE) return new Circle();
        return null;
    }
}
