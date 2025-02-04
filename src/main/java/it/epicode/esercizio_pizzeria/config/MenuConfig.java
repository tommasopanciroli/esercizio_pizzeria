package it.epicode.esercizio_pizzeria.config;

import it.epicode.esercizio_pizzeria.entities.Bevanda;
import it.epicode.esercizio_pizzeria.entities.Menu;
import it.epicode.esercizio_pizzeria.entities.Pizza;
import it.epicode.esercizio_pizzeria.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    //Pizze
    @Autowired
    private Pizza pizzaMargherita;
    @Autowired
    private Pizza pizzaDiavola;
    @Autowired
    private Pizza pizzaNapoletana;

    //Bevande
    @Autowired
    private Bevanda cocaCola;
    @Autowired
    private Bevanda sprite;
    @Autowired
    private Bevanda fanta;

    //Topping
    @Autowired
    private Topping mozzarella;
    @Autowired
    private Topping pomodoro;
    @Autowired
    private Topping funghi;
    @Autowired
    private Topping salame;
    @Autowired
    private Topping prosciutto;

    @Bean
    public Menu menu() {
        Menu menu = new Menu();

        return menu;
    }
}
