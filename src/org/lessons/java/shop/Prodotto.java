package org.lessons.java.shop;

public class Prodotto {

    // Attributi
    protected int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected double iva;

    // Costruttore
    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
