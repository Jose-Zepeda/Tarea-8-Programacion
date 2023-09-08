package pkgPizza.Especialidades;

import pkgPizza.Base.Pizza;
import pkgPizza.Base.Topping;

public class PizzaVegetariana extends Pizza
{
    private double maiz = 10;
    public PizzaVegetariana(String name, double price, String tamaño)
    {
        super(name, price, tamaño);
    }

    public void addMaiz()
    {
        addTopping(new Topping("Maiz", maiz));
    }

    public void prepare()
    {
        addMaiz();

        System.out.println("Preparando Pizza Vegetariana. . .");
        System.out.println("Dividiendo los granos del maiz...");
        System.out.println("Lavando el maiz...");
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

        System.out.println("Tu pizza vegetariana esta lista!");
        getTotalPrice();
    }

}
