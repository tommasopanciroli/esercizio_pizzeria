package it.epicode.esercizio_pizzeria.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements ElementoMenu {

    private String nomeBevanda;
    private double prezzo;
    private int calorie;

    @Override
    public String getNome() {
        return nomeBevanda;
    }
}