package Hoitavoexercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o primeiro número: ");

        a = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        b = ler.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = ler.nextInt();

        if (a < b){
        } else if (b > c) {
            System.out.println(a + "-" + b + "-" + c);
        } else {
            System.out.println("Digite em ordem decrescente");
        }
    }
}
