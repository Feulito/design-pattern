package factoryPattern;

import factoryPattern.enumerations.ShapeEnum;
import factoryPattern.factories.ShapeFactory;
import factoryPattern.interfaces.Shape;

/**
 * La factory est un des patrons de conception (design-pattern) les plus utilisés.
 * Il s'agit de la meilleure manière de créer un objet !
 * Elle ajoute une couche d'abstraction au niveau de la création des objets.
 * Ainsi, on n'expose pas la logique de création au client. On retourne uniquement
 * une référence vers de nouveaux objets qui partagent une même interface.
 * Il y a plusieurs manières d'implémenter une Factory :
 * - Avec une méthode prenant un String en paramètre
 * - Avec des méthodes explicites
 * - Avec une seule méthode, et une énumération
 *
 * La première manière et la secondes sont faciles à comprendre et à implémenter
 * La seconde est un peux plus complexe, mais permet de réaliser des choses plus poussées
 * Dans ce projet nous avons implémenté les deux manières.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("rectangle");
        Shape square = ShapeFactory.getShape(ShapeEnum.SQUARE);
        Shape cicrle = ShapeFactory.getCircle();

        assert rectangle != null;
        rectangle.draw();
        assert square != null;
        square.draw();
        // ici pas besoin d'assertion car getCircle ne renvoit jamais null
        cicrle.draw();
    }
}
