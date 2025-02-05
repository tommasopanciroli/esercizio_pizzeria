package it.epicode.esercizio_pizzeria.tavoli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int numeroMaxCoperti;
    private StatoTavolo statoTavolo;
}