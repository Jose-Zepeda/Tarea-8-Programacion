package pkgPizza.Especialidades;

import pkgPizza.Base.Pizza;
import pkgPizza.Base.Topping;
public class PizzaAlemana extends Pizza
{
    private double champiñones = 25;
    public PizzaAlemana(String name, double price, String tamaño)
    {
        super(name, price, tamaño);
    }

    public void addChampiñones()
    {
        addTopping(new Topping("Champiñones", champiñones));
    }

    public void prepare()
    {
        addChampiñones();

        System.out.println("Preparando Pizza Alemana. . .");
        System.out.println("Recolectando champiñones del bosque...");
        System.out.println("Rodajeando champiñones");
        System.out.println("Agregando los ingredientes:");

        for (Topping topping : getToppings())
        {
            System.out.println("- "+topping.getName());

            try
            {
                Thread.sleep(1000);
            }
            catch (Exception ex)
            {
                System.out.println("Error: " + ex.getMessage());
            }
        }

        System.out.println("Tu pizza alemana esta lista!");
        getTotalPrice();
    }
}
