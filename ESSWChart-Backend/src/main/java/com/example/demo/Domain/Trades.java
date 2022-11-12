package com.example.demo.Domain;

public class Trades
{

    private int investments;
    private int exports;
    private int imports;
    private int taxes;


    public int getInvestments() {
        return investments;
    }

    public void setInvestments(int investments) {
        this.investments = investments;
    }

    public int getExports() {
        return exports;
    }

    public void setExports(int exports) {
        this.exports = exports;
    }

    public int getImports() {
        return imports;
    }

    public void setImports(int imports) {
        this.imports = imports;
    }

    public int getTaxes() {
        return taxes;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }
}
