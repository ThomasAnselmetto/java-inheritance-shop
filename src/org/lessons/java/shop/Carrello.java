package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // raccolgo input utente
                System.out.print("Nome: ");
                String NomeProdotto = scanner.nextLine();
                System.out.print("Descrizione: ");
                String descrizioneProdotto = scanner.nextLine();
                System.out.print("Prezzo: ");
                String priceString = scanner.nextLine();
                BigDecimal prezzoProdotto = new BigDecimal(priceString);
                System.out.print("Iva: ");
                String vatString = scanner.nextLine();
                BigDecimal ValoreIva = new BigDecimal(vatString);



//                ho dovuto mettere il prodotto selezionato fuofi per questione di scope immagino,appena riesco lo fixo

                int prodottoSelezionato;
                do {

                    System.out.println("Quale prodotto ti interessa?");
                    System.out.println("Cerchi uno smartphone? Digita 1");
                    System.out.println("Cerchi una televisione? Digita 2");
                    System.out.println("Cerchi delle cuffie? Digita 3");
                    prodottoSelezionato = scanner.nextInt();
                } while (prodottoSelezionato < 1 || prodottoSelezionato > 3);

                if (prodottoSelezionato == 1) {
                    System.out.println("Hai selezionato uno smartphone! Ora inserisci le seguenti specifiche");
                    System.out.println("Codice IMEI");
                    System.out.println("Quantita' di memoria");
                    Prodotto nuovoProdotto = new Smartphone(NomeProdotto,descrizioneProdotto,prezzoProdotto,ValoreIva,)
                } else if (prodottoSelezionato == 2) {
                    System.out.println("Hai selezionato una televisione! Ora inserisci le seguenti specifiche");
                    System.out.println("dimensione in pollici");
                    System.out.println("desideri uno smart TV?");

                } else {
                    System.out.println("Hai selezionato delle cuffie! Ora inserisci le seguenti specifiche");
                    System.out.println("di che colore vuoi le tue cuffie?");
                    System.out.println("Le vorresti wireless?");
                }
            }
        }
