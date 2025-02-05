package it.epicode.esercizio_pizzeria.services;

import it.epicode.esercizio_pizzeria.entities.Menu;
import it.epicode.esercizio_pizzeria.config.MenuConfig;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final Menu menu;

    // Inietta il menu generato da MenuConfig
    public MenuService(MenuConfig menuConfig) {
        this.menu = menuConfig.creaMenu();
    }

    // Metodo per ottenere il menù
    public Menu getMenu() {
        return menu;
    }
}