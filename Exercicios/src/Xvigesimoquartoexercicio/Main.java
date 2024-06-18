package Xvigesimoquartoexercicio;

public class Main {
    public static void main(String[] args) {
//      24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
//      sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
//      distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//      Fórmula: distância = tempo x velocidade.
//
//      litros usados = distância / 12.


        double tempo = 3;
        double velocidade = 70;
        double distancia;
        double litros;

        distancia = tempo * velocidade;
        litros = distancia / 12;

        System.out.print("Resultados:\n");
        System.out.print("Velocidade média = " + velocidade + " Km/h\n");
        System.out.print("Tempo gasto = " + tempo + " horas\n");
        System.out.print("Distancia Percorrida = " + distancia + " Km\n");
        System.out.print("Quantidade de Combustível utilizado: " + litros + " litros\n");
    }
}
