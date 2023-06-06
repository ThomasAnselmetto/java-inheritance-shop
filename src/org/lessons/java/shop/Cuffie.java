package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    private String colore;
    private boolean isWireless;
    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,String colore,boolean isWireless){
        super(nome,descrizione,prezzo,iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }
}
