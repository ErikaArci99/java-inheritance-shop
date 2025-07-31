package org.lessons.java.shop;

public class Televisori extends Prodotto {

    // Attributi specifici
    private int dimensione;
    private boolean smartTv;

    // Costruttore
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensione,
            boolean smartTv) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.smartTv = smartTv;
    }

    // Metodi getter e setter
    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    // Override del metodo toString per una rappresentazione leggibile
    @Override
    public String toString() {
        return "Televisore - Codice: " + codice + ", Nome: " + nome + ", Marca: " + marca +
                ", Prezzo: " + prezzo + "€, IVA: " + iva + "%, Dimensione: " + dimensione +
                " pollici, Smart TV: " + (smartTv ? "Sì" : "No");
    }
}
