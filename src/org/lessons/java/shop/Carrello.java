package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

//                chiedo all'acquirente quanti oggetti vuole acquistare e sviluppo l'array carrelloCliente in base al suo input
                System.out.println("quanti elementi vuoi acquistare?");
                int quantitativoProdotti = scanner.nextInt();
                scanner.nextLine();
//    non ho gestito la validazione del numero degli elementi da acquistare
                Prodotto[] carrelloCliente  = new Prodotto[quantitativoProdotti];

                for (int i = 0; i < quantitativoProdotti; i++) {

                    // raccolgo input utente
                    System.out.print("Nome: ");
                    String NomeProdotto = (scanner.nextLine());
                    System.out.print("Descrizione: ");
                    String descrizioneProdotto = scanner.nextLine();
                    System.out.print("Prezzo: ");
                    String priceString = scanner.nextLine();
                    BigDecimal prezzoProdotto = new BigDecimal(priceString);
                    System.out.print("Iva: ");
                    String vatString = scanner.nextLine();
                    BigDecimal ValoreIva = new BigDecimal(vatString);

                    Prodotto nuovoProdotto = new Prodotto(NomeProdotto,descrizioneProdotto,prezzoProdotto,ValoreIva);


//                ho dovuto mettere il prodotto selezionato fuofi per questione di scope immagino,appena riesco lo fixo

                    int prodottoSelezionato;
                    do {

                        System.out.println("Quale prodotto ti interessa?");
                        System.out.println("Cerchi uno smartphone? Digita 1");
                        System.out.println("Cerchi una televisione? Digita 2");
                        System.out.println("Cerchi delle cuffie? Digita 3");
                        prodottoSelezionato = scanner.nextInt();
                    } while (prodottoSelezionato < 1 || prodottoSelezionato > 3);

//                OVVIAMENTE LA SCELTA CORRETTA CREDO FOSSE LO SWITCH (HO PROVATO A FARE CON GLI IF)

                    if (prodottoSelezionato == 1) {
                        System.out.println("Hai selezionato uno smartphone! Ora inserisci le seguenti specifiche");
                        System.out.println("Codice IMEI");
                        int inputImei = scanner.nextInt();
                        System.out.println("Quantita' di memoria");
                        int inputMemoria = scanner.nextInt();scanner.nextLine();
                        nuovoProdotto = new Smartphone(NomeProdotto,descrizioneProdotto,prezzoProdotto,ValoreIva,inputImei,inputMemoria);
                        System.out.println("Inserito nel carrello " + nuovoProdotto.toString());
                    } else if (prodottoSelezionato == 2) {
                        System.out.println("Hai selezionato una televisione! Ora inserisci le seguenti specifiche");
                        System.out.println("dimensione in pollici");
                        int inputPollici = scanner.nextInt();scanner.nextLine();
                        System.out.println("desideri uno smart TV? rispondi con s/n");
                        boolean inputSmart = scanner.nextLine().equals("s");
                        nuovoProdotto = new Televisori(NomeProdotto,descrizioneProdotto,prezzoProdotto,ValoreIva,inputPollici,inputSmart);
                        System.out.println("Inserito nel carrello " + nuovoProdotto.toString());
                    } else {
                        System.out.println("Hai selezionato delle cuffie! Ora inserisci le seguenti specifiche");
                        System.out.println("di che colore vuoi le tue cuffie?");
                        String inputColore = scanner.nextLine();
                        System.out.println("Le vorresti wireless? rispondi con s/n");
                        boolean inputWire = scanner.nextLine().equals("s");
                        nuovoProdotto = new Cuffie(NomeProdotto,descrizioneProdotto,prezzoProdotto,ValoreIva,inputColore,inputWire);
                        System.out.println("Inserito nel carrello " + nuovoProdotto.toString());
                    }
//                    vediamo...
                    carrelloCliente[i] = nuovoProdotto;
//                    per ogni elemento nel carrelloCliente effettuo un to string

                    System.out.println("Resoconto carrello " + Arrays.toString(carrelloCliente));

                }


            }
        }
