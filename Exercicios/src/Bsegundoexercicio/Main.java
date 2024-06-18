package Bsegundoexercicio;

public class Main {
    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        int numero = 0;
        int poi = numero % 2;

        if (poi == 0){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

        if (numero > 0){
            System.out.println("Número Positivo");
        } else if (numero == 0) {
            System.out.println("Número Neutro");
        } else if (numero < 0) {
            System.out.println("Número Negativo");
        }
    }
}
