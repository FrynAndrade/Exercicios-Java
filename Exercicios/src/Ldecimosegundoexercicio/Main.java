package Ldecimosegundoexercicio;

public class Main {
    public static void main(String[] args) {
//        12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
//        conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
//        Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

//        Tabela de Código de Condições de Pagamento
//        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//        2 - À Vista no cartão de crédito, recebe 10% de desconto
//        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        String formaPagamento = "Parcelado três ou mais";
        double valorProduto = 2000.0;

        if (formaPagamento == "Pix"){
            valorProduto *= 0.15;
            System.out.println("Valor do produto com 15% de desconto é de R$" + valorProduto);
        } else if (formaPagamento == "Cartão de credito") {
            valorProduto *= 0.10;
            System.out.println("Valor do produto com 10% de desconto é de R$" + valorProduto);
        } else if (formaPagamento == "Parcelado duas vezes") {
            System.out.println("Valor do produto parcelado em duas vezes é de R$" + valorProduto);
        } else if (formaPagamento == "Parcelado três ou mais") {
            valorProduto = valorProduto + valorProduto * 0.10;
            System.out.println("Valor do produto parcelado em três ou mais vezes com 10% de juros é de R$" + valorProduto);
        }
    }
}
