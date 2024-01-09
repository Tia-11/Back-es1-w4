package MattiaP.BackW4Es1.entities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class ConfigurazioneBeans {
    @Bean
    public Pizza margherita() {

        return new Pizza("Margherita", Arrays.asList(), 1000, 5.0);
    }

    @Bean
    public Pizza tirolese() {

        return new Pizza("Tirolese", Arrays.asList( "speck"), 1200, 6.0);
    }

    @Bean
    public Pizza zola() {

        return new Pizza("Gorgonzola", Arrays.asList( "gorgonzola"), 1400, 7.0);
    }

    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 100, 0.5);
    }

    @Bean
    public Topping speck() {
        return new Topping("Speck", 200, 1.0);
    }

    @Bean
    public Topping gorgonzola() {
        return new Topping("Gorgonzola", 400, 2.0);
    }

    @Bean
    public Topping cipolla() {
        return new Topping("Cipolla", 50, 0.5);
    }

    @Bean
    public Bevanda acquaNaturale() {
        return new Bevanda("Acqua Naturale", 0, 1.0);
    }

    @Bean
    public Bevanda cocaCola() {
        return new Bevanda("Coca-Cola", 100, 3.0);
    }

    @Bean
    public Bevanda caffe() {
        return new Bevanda("Caffè", 20, 1.0);
    }

    @Bean
    public Menu menu() {

        Menu menu = new Menu();
        menu.addPizza(margherita());
        menu.addPizza(tirolese());
        menu.addPizza(zola());
        menu.addTopping(mozzarella());
        menu.addTopping(speck());
        menu.addTopping(gorgonzola());
        menu.addTopping(cipolla());
        menu.addDrink(acquaNaturale());
        menu.addDrink(cocaCola());
        menu.addDrink(caffe());
        return menu;
    }


}

