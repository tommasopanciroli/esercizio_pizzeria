package it.epicode.esercizio_pizzeria.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topping {

    private String nomeTopping;
    private int calorie;
    private double prezzo;
}
