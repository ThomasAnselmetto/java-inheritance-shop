package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    private int codiceImei;
    private BigDecimal memoriaDisponibile;
    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,int codiceImei,BigDecimal memoriaDisponibile){
        super(nome,descrizione,prezzo,iva);
        this.codiceImei = codiceImei;
        this.memoriaDisponibile = memoriaDisponibile;
    }
}
