package adapterPattern.implementations;

import adapterPattern.interfaces.InterfaceClassB;

public class ClassB implements InterfaceClassB {
    @Override
    public void methodeB() {
        System.out.println("Methode B");
    }
}
