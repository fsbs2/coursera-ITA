package com.coursera.ita.oo.exercicio1.imc;

public class Principal {
    public static void main(String args[]) {
        Paciente p1 = new Paciente(90,1.80);
        System.out.println("Paciente 1:" + "IMC " + p1.calcularImc());
        System.out.println(p1.diagnostico());

        Paciente p2 = new Paciente(72.80,1.60);
        System.out.println("\nPaciente 2:" + "IMC "+p2.calcularImc());
        System.out.println(p2.diagnostico());

        Paciente p3 = new Paciente(87,1.94);
        System.out.println("\nPaciente 3:"+"IMC "+p3.calcularImc());
        System.out.println(p3.diagnostico());


    }
}
