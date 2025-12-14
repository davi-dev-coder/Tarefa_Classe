package com.mycompany.desafios;

// Classe que representa um círculo
public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter
    public double getRaio() {
        return raio;
    }

    // Setter
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular área
    public double calcularArea() {
        double pi = 3.14159;
        return pi * raio * raio;
    }
}

