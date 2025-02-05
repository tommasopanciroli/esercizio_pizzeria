package it.epicode.esercizio_pizzeria;

import it.epicode.esercizio_pizzeria.config.MenuConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MenuNotNullTest {

    @Autowired
    private MenuConfig menuRepository;

    @Test
    void contextLoads() {
        assertThat(menuRepository).isNotNull();
    }
}
