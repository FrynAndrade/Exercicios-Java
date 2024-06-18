package Wvigesimoterceiroexercicio;

public class Main {
    public static void main(String[] args) {
//        23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
//        As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
//        Imprima na tela o salário líquido final.

        double valorHoraAula = 130;
        double aulasLecionadas = 25;
        double salarioProfessor = aulasLecionadas * valorHoraAula;
        double descontoINSS = 0.14;
        double salarioLiquido = salarioProfessor - (salarioProfessor * descontoINSS);

        System.out.println("Salário do Professor Frin no mês de Maio foi de " + salarioLiquido);

    }
}
