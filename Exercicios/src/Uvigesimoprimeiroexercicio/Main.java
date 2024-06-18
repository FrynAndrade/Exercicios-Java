package Uvigesimoprimeiroexercicio;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

        Random aleatorio = new Random();

        System.out.println(aleatorio.nextInt(101));
    }
}
