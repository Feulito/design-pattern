package prototypePattern.cache;

import prototypePattern.enumerations.ShapeType;
import prototypePattern.implementations.Circle;
import prototypePattern.implementations.Rectangle;
import prototypePattern.implementations.Shape;
import prototypePattern.implementations.Square;

import java.util.HashMap;

public class ShapeCache {

    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    public static void loadCache() {
        shapeMap.put(ShapeType.CIRCLE.toString(), new Circle());
        shapeMap.put(ShapeType.SQUARE.toString(), new Square());
        shapeMap.put(ShapeType.RECTANGLE.toString(), new Rectangle());
    }

    public static Shape getShape(ShapeType type) {
        return shapeMap.get(type.toString());
    }
}
