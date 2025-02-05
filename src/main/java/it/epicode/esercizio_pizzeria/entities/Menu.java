package it.epicode.esercizio_pizzeria.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private String nomeMenu;
    List<ElementoMenu> elementiMenu = new ArrayList<>();

}
