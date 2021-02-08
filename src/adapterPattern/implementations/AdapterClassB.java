package adapterPattern.implementations;

import adapterPattern.interfaces.InterfaceClassA;

public class AdapterClassB implements InterfaceClassA {

    private ClassB classB;

    public AdapterClassB(ClassB classB) {
        this.classB = new ClassB();
    }

    @Override
    public void methodeA() {
        this.classB.methodeB();
    }
}
