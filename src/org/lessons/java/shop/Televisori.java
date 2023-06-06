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

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "Specifiche Televisore {" +
                "pollici=" + pollici +
                ", isSmart=" + isSmart +
                '}';
    }
}
