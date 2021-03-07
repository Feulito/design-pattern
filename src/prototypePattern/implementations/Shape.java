package prototypePattern.implementations;

import prototypePattern.enumerations.ShapeType;

public abstract class Shape implements Cloneable {

    private String id;
    protected ShapeType type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public ShapeType getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
