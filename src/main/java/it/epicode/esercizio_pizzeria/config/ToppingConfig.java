package it.epicode.esercizio_pizzeria.config;

import it.epicode.esercizio_pizzeria.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping pomodoro() {
        Topping topping = new Topping();
        topping.setNomeTopping("Pomodoro");
        topping.setCalorie(50);
        topping.setPrezzo(0.5);
        return topping;
    }

    @Bean
    public Topping mozzarella() {
        Topping topping = new Topping();
        topping.setNomeTopping("Mozzarella");
        topping.setCalorie(100);
        topping.setPrezzo(1.0);
        return topping;
    }

    @Bean
    public Topping funghi() {
        Topping topping = new Topping();
        topping.setNomeTopping("Funghi");
        topping.setCalorie(50);
        topping.setPrezzo(0.5);
        return topping;
    }

    @Bean
    public Topping prosciutto() {
        Topping topping = new Topping();
        topping.setNomeTopping("Prosciutto");
        topping.setCalorie(50);
        topping.setPrezzo(0.5);
        return topping;
    }

    @Bean
    public Topping salame() {
        Topping topping = new Topping();
        topping.setNomeTopping("Salame");
        topping.setCalorie(50);
        topping.setPrezzo(0.5);
        return topping;
    }
}
