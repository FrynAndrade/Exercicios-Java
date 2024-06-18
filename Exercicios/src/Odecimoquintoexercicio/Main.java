package Odecimoquintoexercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
//        meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
//        (Ex: 5 anos, 2 meses e 15 dias de vida)
        int idade = 22;
        int anos = 365 * idade;
        int mes = 12;

        System.out.println("Anos: " + idade);
        System.out.println("Mês: " + mes);
        System.out.println("Dias: " + anos);
        System.out.println(idade + " anos, " + mes + " meses e " + anos + " dias de vida");

    }
}
