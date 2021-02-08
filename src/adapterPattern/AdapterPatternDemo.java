package adapterPattern;

import adapterPattern.implementations.AdapterClassB;
import adapterPattern.implementations.ClassA;
import adapterPattern.implementations.ClassB;
import adapterPattern.interfaces.InterfaceClassA;

import java.util.ArrayList;

/**
 * Le but de ce l'Adapter Pattern est de donner la possibilité au client
 * D'utiliser une interface qui n'est pas implémentée par la classe qu'il utilise
 * On fait alors une classe qui va implémenter l'interface cible
 * Et qui va renvoyer à la propre implémentation de la classe utilisée
 */
public class AdapterPatternDemo {

    public static final void main(String[] args) {
        ArrayList<InterfaceClassA> liste = new ArrayList<>();

        ClassA classeA = new ClassA();
        ClassB classeB = new ClassB();


        // Ici on ajoute pas classeB directement, sinon il n'aura pas accès à la méthode methodeA
        // Donc on ajoute l'adaptateur, qui possède la methode methodeA
        liste.add(classeA);
        liste.add(new AdapterClassB(classeB));

        for (InterfaceClassA classe : liste) {
            classe.methodeA();
        }
    }

}
