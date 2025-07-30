package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    // Attributi specifici

    private String imei;
    private int memoriaInterna;

    // Costruttore
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei,
            int memoriaInterna) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoriaInterna = memoriaInterna;
    }

    // Metodi getter e setter
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

}
