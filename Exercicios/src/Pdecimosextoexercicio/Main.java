package Pdecimosextoexercicio;

public class Main {
    public static void main(String[] args) {
//        16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
//        e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

        int lado1 = 10;
        int lado2 = 5;
        int lado3 = 5;

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("Triângulo Equilátero: possui os 3 lados iguais");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles: possui 2 lados iguais");
        } else {
            System.out.println("Triângulo escaleno: possui os 3 lados diferentes");
        }
    }
}
