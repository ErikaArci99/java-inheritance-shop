package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti prodotti vuoi inserire? ");
        // Input per il numero di prodotti
        // Assumiamo che l'utente inserisca un numero valido
        int n = Integer.parseInt(scanner.nextLine());

        // Creazione di un array per memorizzare i prodotti
        Prodotto[] carrello = new Prodotto[n];

        // Ciclo per l'inserimento dei prodotti
        for (int i = 0; i < n; i++) {
            System.out.println("\nProdotto " + (i + 1));

            System.out.print("Tipo di prodotto (smartphone / televisore / cuffie): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Codice: ");
            int codice = Integer.parseInt(scanner.nextLine());

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Prezzo: ");
            double prezzo = Double.parseDouble(scanner.nextLine());

            System.out.print("IVA: ");
            double iva = Double.parseDouble(scanner.nextLine());

            if (tipo.equals("smartphone")) {
                System.out.print("IMEI: ");
                String imei = scanner.nextLine();

                System.out.print("Memoria interna (GB): ");
                int memoria = Integer.parseInt(scanner.nextLine());

                carrello[i] = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);

            } else if (tipo.equals("televisore")) {
                System.out.print("Dimensione (pollici): ");
                int dimensione = Integer.parseInt(scanner.nextLine());

                System.out.print("Smart TV? (sì/no): ");
                boolean smart = scanner.nextLine().equalsIgnoreCase("sì");

                carrello[i] = new Televisori(codice, nome, marca, prezzo, iva, dimensione, smart);

            } else if (tipo.equals("cuffie")) {
                System.out.print("Colore: ");
                String colore = scanner.nextLine();

                System.out.print("Wireless? (sì/no): ");
                boolean wireless = scanner.nextLine().equalsIgnoreCase("sì");

                carrello[i] = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);

            } else {
                System.out.println("Tipo non valido. Riprova.");
            }
        }

        // Stampa del carrello
        System.out.println("\n Prodotti nel carrello:");
        for (int i = 0; i < carrello.length; i++) {
            Prodotto p = carrello[i];
            System.out.println(
                    "[" + (i + 1) + "] " + p.getNome() + " - " + p.getMarca() + " - Prezzo: " + p.getPrezzo() + "Eur + "
                            + p.getIva() + "IVA");
        }

        scanner.close();
    }
};