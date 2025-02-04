package it.epicode.esercizio_pizzeria.config;

import it.epicode.esercizio_pizzeria.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza pizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNomePizza("Margherita");
        pizza.setPrezzo(5.0);
        pizza.setCalorie(300);
        return pizza;
    }

    @Bean
    public Pizza pizzaDiavola() {
        Pizza pizza = new Pizza();
        pizza.setNomePizza("Diavola");
        pizza.setPrezzo(6.0);
        pizza.setCalorie(500);
        return pizza;
    }

    @Bean
    public Pizza pizzaNapoletana() {
        Pizza pizza = new Pizza();
        pizza.setNomePizza("Napoletana");
        pizza.setPrezzo(7.0);
        pizza.setCalorie(400);
        return pizza;
    }
}
