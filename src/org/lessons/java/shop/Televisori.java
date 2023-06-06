package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{

    private int pollici;
    private boolean isSmart;


    public Televisori(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,int pollici,boolean isSmart){
        super(nome,descrizione,prezzo,iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }
}
