package br.com.codigodebase_logica;

import java.util.Scanner;

public class TesteSemana1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float valor;
        String produto;
        char estado;

        System.out.println("Qual produto quer comprar?");
        produto = ler.nextLine();

        System.out.println("Em que estado mora? Digite apenas a sigla.");
        estado = ler.next().charAt(0);

        System.out.println("Valor do produto:");
        valor = ler.nextInt();

        System.out.println("O produto "+produto+" no valor de R$"
        +valor+" será entregue em: "+estado);



    }
}
