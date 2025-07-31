package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    // Attributi specifici
    private String colore;
    private boolean wireless;

    // Costruttore
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // Metodi getter e setter
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // Override del metodo toString per una rappresentazione leggibile
    @Override
    public String toString() {
        return "Cuffie - Codice: " + codice + ", Nome: " + nome + ", Marca: " + marca +
                ", Prezzo: " + prezzo + "€, IVA: " + iva + "%, Colore: " + colore +
                ", Wireless: " + (wireless ? "Sì" : "No");
    }
}
