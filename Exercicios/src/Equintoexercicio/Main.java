package Equintoexercicio;

public class Main {
    public static void main(String[] args) {
        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        // calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
        // (Base para o Salário mínimo R$ 1.293,20).

        double salarioUsuario = 15612.00;
        double salarioMinimo = 1293.20;

        double resultado = salarioUsuario / salarioMinimo;

        System.out.println("O usuário Frin recebe " + resultado + " salários mínimos");
    }
}
