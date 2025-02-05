package it.epicode.esercizio_pizzeria;



import it.epicode.esercizio_pizzeria.entities.Menu;
import it.epicode.esercizio_pizzeria.services.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MenuServiceTest {

    @Autowired
    private MenuService menuService;

    @Test
     void testMenuCompleto() {
        List<String> menuAtteso = List.of("Margherita", "Diavola", "Napoletana", "Coca-Cola", "Sprite", "Fanta", "Mozzarella", "Pomodoro", "Salame", "Prosciutto", "Funghi");

        Menu menuGenerato = menuService.getMenu();

        List<String> nomiElementiMenu = menuGenerato.getElementiMenu()
                .stream()
                .map(elemento -> elemento.getNome())
                .collect(Collectors.toList());


        for (String voce : menuAtteso) {
            assertTrue(nomiElementiMenu.contains(voce), "Il menù non contiene: " + voce);
        }
    }
}

