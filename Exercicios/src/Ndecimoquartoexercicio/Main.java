package Ndecimoquartoexercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // 14 - Faça um algoritmo que receba um valor A e B,
       // e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        Scanner scanner = new Scanner(System.in);
        int A, B, VariavelTemporaria;

        System.out.println("Digite a variavel A: ");
        A = scanner.nextInt();

        System.out.println("Digite a variavel B: ");
        B = scanner.nextInt();

        VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.println("Variavel A é " + A + " Variavel B é " + B);

    }
}
