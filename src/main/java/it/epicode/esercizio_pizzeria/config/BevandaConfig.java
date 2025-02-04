package it.epicode.esercizio_pizzeria.config;

import it.epicode.esercizio_pizzeria.entities.Bevanda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {
    
    @Bean
    public Bevanda cocaCola() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNomeBevanda("Coca-Cola");
        bevanda.setCalorie(150);
        bevanda.setPrezzo(1.5);
        return bevanda;
    }

    @Bean
    public Bevanda fanta() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNomeBevanda("Fanta");
        bevanda.setCalorie(150);
        bevanda.setPrezzo(1.5);
        return bevanda;
    }

    @Bean
    public Bevanda sprite() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNomeBevanda("Sprite");
        bevanda.setCalorie(150);
        bevanda.setPrezzo(1.5);
        return bevanda;
    }
}
