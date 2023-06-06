package org.lessons.java.shop;
import java.math.BigDecimal;
import java.util.Random;


public class Prodotto {
    // Attributi
    private final int codice;
    private String nome;
    private String descrizione;
    private BigDecimal  prezzo;
    private BigDecimal iva;

    //Costruttore
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = generateCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //Getters e Setters
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public BigDecimal getPrezzo() {
        return prezzo;
    }
    public BigDecimal getIva() {
        return iva;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

//    Metodi

//   a differenza dell esercizio faccio da me ieri inserisco bigdecimal e utilizzo i suoi metodi multiply() e add() per stabilire il valore dell'iva e successivamente sommarlo al prezzo'
    public BigDecimal prezzoIvato(){
        BigDecimal ivaSulPrezzo = prezzo.multiply(iva);
        return prezzo.add(ivaSulPrezzo);
    }
    //    Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
    public String NomeCompleto() {

        return codice + "-" + nome;
    }
//    mi sono cancellato il metodo per creare il codice ma cosi' non ce l'ho piu' da nessuna parte'

    private int generateCode() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
    @Override
    public String toString() {
        return "Prodotto {" +
                "codice =" + codice +
                ", nome ='" + nome + '\'' +
                ", descrizione ='" + descrizione + '\'' +
                ", prezzo =" + prezzo +
                ", iva =" + iva +
                '}';
    }
}
