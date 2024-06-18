package Cterceiroexercicio;

public class Main {
    public static void main(String[] args) {
        // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
        // deverá somar os dois valores, caso contrário devera multiplicar A por B.
        // Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

        int valorA = 10;
        int valorB = 11;

        if (valorA == valorB){
            int resultado = valorA + valorB;
            System.out.println("O valorC é " + resultado);
        } else if (valorA != valorB) {
            int resultado = valorA * valorB;
            System.out.println("O valorC é " + resultado);
        }
    }
}
