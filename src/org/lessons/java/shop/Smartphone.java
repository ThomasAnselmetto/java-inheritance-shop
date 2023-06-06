package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    private int codiceImei;
    private int memoriaDisponibile;
    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva,int codiceImei,int memoriaDisponibile){
        super(nome,descrizione,prezzo,iva);
        this.codiceImei = codiceImei;
        this.memoriaDisponibile = memoriaDisponibile;
    }

    public int getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoriaDisponibile() {
        return memoriaDisponibile;
    }

    public void setMemoriaDisponibile(int memoriaDisponibile) {
        this.memoriaDisponibile = memoriaDisponibile;
    }

    @Override
    public String toString() {
        return super.toString() + "Specifiche Smartphone {" +
                "codiceImei=" + codiceImei +
                ", memoriaDisponibile=" + memoriaDisponibile +
                '}';
    }
}
