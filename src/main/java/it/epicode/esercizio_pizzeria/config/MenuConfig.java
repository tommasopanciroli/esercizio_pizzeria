package it.epicode.esercizio_pizzeria.config;

import it.epicode.esercizio_pizzeria.entities.Bevanda;
import it.epicode.esercizio_pizzeria.entities.Menu;
import it.epicode.esercizio_pizzeria.entities.Pizza;
import it.epicode.esercizio_pizzeria.entities.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {

    private final Bevanda cocaCola;
    private final Bevanda sprite;
    private final Bevanda fanta;
    private final Pizza pizzaMargherita;
    private final Pizza pizzaDiavola;
    private final Pizza pizzaNapoletana;
    private final Topping pomodoro;
    private final Topping mozzarella;
    private final Topping salame;
    private final Topping funghi;
    private final Topping prosciutto;

    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setNomeMenu("Menu Pranzo");
        m.setElementiMenu(List.of(cocaCola, sprite, fanta, pizzaNapoletana, pizzaMargherita, pizzaDiavola, mozzarella, pomodoro, prosciutto, funghi, salame));
        return m;
    }

}
