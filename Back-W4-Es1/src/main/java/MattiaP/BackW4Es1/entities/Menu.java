package MattiaP.BackW4Es1.entities;


import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizze = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
    private List<Bevanda> bevande = new ArrayList<>();

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }

    public void addPizza(Pizza pizza) {
        this.pizze.add(pizza);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void addDrink(Bevanda bevanda) {
        this.bevande.add(bevanda);
    }

    public void stampaMenu() {
        System.out.println("PIZZE:");
        for (Pizza pizza : pizze) {
            System.out.print("Pizza " + pizza.getNome() + " (ingredienti: pomodoro, mozzarella");
            if (!pizza.getToppings().isEmpty()) {
                System.out.print(", " + String.join(", ", pizza.getToppings()));
            }
            System.out.println(")");
            System.out.println("Calorie: " + pizza.getCalorie() + ", Prezzo: " + pizza.getPrezzo() + "euro");
        }

        System.out.println("\nTOPPINGS:");
        for (Topping topping : toppings) {
            System.out.println("Topping " + topping.getNome());
            System.out.println("Calorie: " + topping.getCalorie() + ", Prezzo: " + topping.getPrezzo() + "euro");
        }

        System.out.println("\nBEVANDE:");
        for (Bevanda bevanda : bevande) {
            System.out.println("Bevanda " + bevanda.getNome());
            System.out.println("Calorie: " + bevanda.getCalorie() + ", Prezzo: " + bevanda.getPrezzo() + "euro");
        }
    }
}


