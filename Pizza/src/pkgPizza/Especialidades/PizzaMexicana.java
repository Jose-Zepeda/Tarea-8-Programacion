package pkgPizza.Especialidades;
import pkgPizza.Base.Pizza;
import pkgPizza.Base.Topping;

public class PizzaMexicana extends Pizza
{
    private double pechugaPollo = 20;
    public PizzaMexicana(String name, double price, String tamaño, Topping... toppings)
    {
        super(name, price, tamaño, toppings);
    }

    public void addPechugaPollo()
    {
        addTopping(new Topping("Pechuga de pollo", pechugaPollo));
    }

    public void prepare()
    {
        addPechugaPollo();

        System.out.println("Preparando Pizza Mexicana. . .");
        System.out.println("Picando el pollo...");
        System.out.println("Cocinando el pollo...");
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

        System.out.println("Tu pizza mexicana esta lista!");
        getTotalPrice();
    }
}
