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

    public int getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }

    public BigDecimal getMemoriaDisponibile() {
        return memoriaDisponibile;
    }

    public void setMemoriaDisponibile(BigDecimal memoriaDisponibile) {
        this.memoriaDisponibile = memoriaDisponibile;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "codiceImei=" + codiceImei +
                ", memoriaDisponibile=" + memoriaDisponibile +
                '}';
    }
}
