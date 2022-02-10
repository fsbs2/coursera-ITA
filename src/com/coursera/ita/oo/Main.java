package com.coursera.ita.oo;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro(10);
        //c1.potencia =10;
        c1.nome="Corcel";
        c1.velocidade = 0;
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        System.out.println(c1.toString());
    }
}
