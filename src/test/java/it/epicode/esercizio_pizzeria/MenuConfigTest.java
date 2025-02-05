package it.epicode.esercizio_pizzeria;

import it.epicode.esercizio_pizzeria.entities.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MenuConfigTest {

    @Autowired
    Menu m;

    @Test
    @DisplayName("Test valori inseriti corretti")
    public void testMenuConfig(){
        assertEquals("Menu pranzo", m.getNomeMenu());
        assertEquals(11,m.getElementiMenu().size());
    }
}
