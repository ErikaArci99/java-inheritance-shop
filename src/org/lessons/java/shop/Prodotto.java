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

    // prende il codice solo in lettura
    public int getCodice() {
        return codice;
    }

    // gli altri attributi sia in lettura chre in scrittura
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

}
