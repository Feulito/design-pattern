package adapterPattern.implementations;

import adapterPattern.interfaces.InterfaceClassA;

public class ClassA implements InterfaceClassA {
    @Override
    public void methodeA() {
        System.out.println("Methode A");
    }
}
