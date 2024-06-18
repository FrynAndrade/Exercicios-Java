package Kdecimoprimeiroexercicio;

public class Main {
    public static void main(String[] args) {
//      11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
//      calcule a média das nota obtidas, imprima na tela o nome do aluno e
//      se o aluno foi aprovado ou reprovado.
//      Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        String nome = "Carlos";
        int nota1 = 9;
        int nota2 = 8;
        int nota3 = 5;
        int nota4 = 6;

        int calcularNota = nota1 + nota2 + nota3 + nota4;
        int mediaNota = calcularNota / 4;

        if (mediaNota >= 7){
            System.out.println("O aluno " + nome + " teve a nota média de: " + mediaNota + " e foi APROVADO.");
        } else
            System.out.println("O aluno " + nome + " teve a nota média de: " + mediaNota + " e foi REPROVADO.");
    }
}
