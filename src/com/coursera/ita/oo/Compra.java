package com.coursera.ita.oo;

public class Compra {
    int valorTotal;
    int numeroParcelas;

    //a vista
    public Compra(int valorTotal) {
        this.valorTotal = valorTotal;
        this.numeroParcelas = 1;
    }

    // parcelado
    public Compra(int numeroParcelas, int valorParcelas) {
        this.numeroParcelas = numeroParcelas;
        this.valorTotal = valorParcelas * numeroParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }
}
