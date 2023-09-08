import pkgPizza.Base.Pizza;
import pkgPizza.Base.Topping;
import pkgPizza.Especialidades.PizzaAlemana;
import pkgPizza.Especialidades.PizzaEspañola;
import pkgPizza.Especialidades.PizzaMexicana;
import pkgPizza.Especialidades.PizzaVegetariana;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PizzaAlemana pizzaAlemana = new PizzaAlemana("Alemana", 100, "large");
        PizzaEspañola pizzaEspañola = new PizzaEspañola("Española", 100, "medium");
        PizzaMexicana pizzaMexicana = new PizzaMexicana("Mexicana", 100, "medium");
        PizzaVegetariana pizzaVegetariana = new PizzaVegetariana("Vegetariana", 100, "medium");
        pizzaAlemana.addTopping(new Topping("Tomate", 10));
        pizzaEspañola.addTopping(new Topping("Cebolla", 5));
        pizzaMexicana.addTopping(new Topping("Peperoni", 15));
        pizzaVegetariana.addTopping(new Topping("Queso", 20));
        pizzaAlemana.prepare();
    }
}