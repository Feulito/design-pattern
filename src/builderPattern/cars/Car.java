package builderPattern.cars;

public class Car {

    private String maker;
    private String model;
    private int nbDoors;
    private String color;

    public Car() { }

    public String getMaker() {
        return maker;
    }

    public Car setMaker(String maker) {
        this.maker = maker;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getNbDoors() {
        return nbDoors;
    }

    public Car setNbDoors(int nbDoors) {
        this.nbDoors = nbDoors;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "Fabriquant ='" + maker + '\'' +
                ", Modele ='" + model + '\'' +
                ", Nombre de Portes =" + nbDoors +
                ", Couleur ='" + color + '\'' +
                '}';
    }
}
