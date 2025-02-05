package it.epicode.esercizio_pizzeria.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements ElementoMenu {

    private String nomePizza;
    private int calorie;
    private double prezzo;
    List<Topping> topping = new ArrayList<>();

    @Override
    public String getNome() {
        return nomePizza;
    }
}
