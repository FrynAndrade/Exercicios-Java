package Vvigesimosegundoexercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // 22 - Faça um algoritmo que leia dois valores inteiros A e B,
        // imprima na tela o quociente e o resto da divisão inteira entre eles.
        Scanner ler = new Scanner(System.in);
        int A;
        int B;
        int quociente;
        int resto;


        System.out.println("Informe o valor do dividendo");
        A = ler.nextInt();
        System.out.println("Informe o valor do divisor");
        B = ler.nextInt();
        quociente = (A / B);
        System.out.println("Quociente = " + quociente);
        resto = (A % B);
        System.out.println("Resto = " + resto);
    }
}
