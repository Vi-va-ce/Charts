package com.example.demo.Domain;

public class Address {
    private String Kebele;
    private String Wereda;
    private String zone;

    public Address()
    {
        super();
    }
    public Address(String kebele, String wereda, String zone) {
        Kebele = kebele;
        Wereda = wereda;
        this.zone = zone;
    }

    public String getKebele() {
        return Kebele;
    }

    public void setKebele(String kebele) {
        Kebele = kebele;
    }

    public String getWereda() {
        return Wereda;
    }

    public void setWereda(String wereda) {
        Wereda = wereda;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
