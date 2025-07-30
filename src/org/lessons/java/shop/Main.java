package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        // Creazione di alcuni prodotti
        Prodotto tv = new Televisori(1, "Samsung 55\"", "Samsung", 799.99, 22, 55, true);
        Prodotto cuffie = new Cuffie(2, "AirPods Pro", "Apple", 249.99, 22, "Bianco", true);
        Prodotto smartphone = new Smartphone(3, "Galaxy S21", "Samsung", 999.99, 22, "123456789012345", 128);

        // Stampa delle informazioni dei prodotti
        System.out.println("Prodotto: " + tv.getNome() + ", Marca: " + tv.getMarca() + ", Prezzo: " + tv.getPrezzo());
        System.out.println(
                "Prodotto: " + cuffie.getNome() + ", Marca: " + cuffie.getMarca() + ", Prezzo: " + cuffie.getPrezzo());
        System.out.println("Prodotto: " + smartphone.getNome() + ", Marca: " + smartphone.getMarca() + ", Prezzo: "
                + smartphone.getPrezzo());
    }
}
