package Aprimeiroexercicio;

public class Main {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela
        // a soma entre A e B é mostre se a soma é menor que C.
        int valorA = 10;
        int valorB = 5;
        int valorC = 16;

        if (valorA + valorB > valorC){
            System.out.println("Valor de A + B é maior que o valor de C");
        } else {
            System.out.println("Valor de A + B é menor que o valor de C");
        }
    }
}