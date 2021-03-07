package prototypePattern;

import prototypePattern.cache.ShapeCache;
import prototypePattern.enumerations.ShapeType;

/**
 * Le patron de conception Prototype consiste à dupliquer des objets, tout en gardant
 * la performance du programme en tête.
 * Ce patron de conception est utilisé lorsque la création des objets est lourde, par exemple en dépendant d'appel à
 * des bases de données.
 * Par exemple, ici, on représente une mémoire cache avec un hashmap.
 * Les objets sont crées une première fois via une requête à une base de donnée et mis en mémoire cache avec le hashMap.
 * Les prochaines fois qu'on voudra retrouver cet objet, pas besoin de re-executer la requête : On cherchera directement
 * dans le hashMap pour en récupérer un clone.
 * De ce fait, on réduit les appels à la base de donnée, et par conséquent le coût de la création de l'objet en question
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        for (ShapeType type : ShapeType.values()) {
            System.out.println("Shape : " + ShapeCache.getShape(type).getType());
        }
    }
}
