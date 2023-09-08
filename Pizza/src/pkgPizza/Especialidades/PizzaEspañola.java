package pkgPizza.Especialidades;

import pkgPizza.Base.Pizza;
import pkgPizza.Base.Topping;

public class PizzaEspañola extends Pizza
{

    private double chorizo = 30;
    public PizzaEspañola(String name, double price, String tamaño)
    {
        super(name, price, tamaño);
    }

    public void addChorizo()
    {
        addTopping(new Topping("Chorizo", chorizo));
    }

    public void prepare()
    {
        addChorizo();

        System.out.println("Preparando Pizza Española. . .");
        System.out.println("Cortando el chorizo...");
        System.out.println("Cocinando el chorizo...");
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

        System.out.println("Tu pizza española esta lista!");
        getTotalPrice();
    }
}
