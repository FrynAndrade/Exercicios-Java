package Rdecimooitavoexercicio;

public class Main {
    public static void main(String[] args) {
//        18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
//        Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

        double francisco = 1.50;
        double sara = 1.10;
        int ano = 0;

        while (francisco > sara) {
            francisco += 0.02;
            sara += 0.03;
            ano++;

        }
        System.out.println("São necessarios " + ano + " anos para que francisco seja maior que sara");
    }
}
