package it.epicode.esercizio_pizzeria.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda {

    private String nomeBevanda;
    private int calorie;
    private double prezzo;
}
