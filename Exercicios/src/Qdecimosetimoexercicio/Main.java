package Qdecimosetimoexercicio;

public class Main {
    public static void main(String[] args) {
//        17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
//        Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)

        double Fahrenheit = 87.8;
        double Celsius;

        Celsius = (5 * (Fahrenheit - 32) / 9);

        System.out.println(Celsius + " ºC");
    }
}
