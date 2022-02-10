package com.coursera.ita.oo;

public class Carro {
    int potencia;
    int velocidade;
    String nome;

    Carro(int potencia){
        this.potencia = potencia;
        this.velocidade=0;

    }

    public void acelerar(){
        velocidade += potencia;
    }
    public void frear(){
        velocidade /= 2;
    }

    @Override
    public java.lang.String toString() {
        return "Carro{" +
                "potencia=" + potencia +
                ", velocidade=" + velocidade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
