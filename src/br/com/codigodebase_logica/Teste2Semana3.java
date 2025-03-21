package br.com.codigodebase_logica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste2Semana3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String produto;
        float  valor;
        float total = 0.0f;
        int  quantitens =0;
        char continua   ='S';

        System.out.println("Continuar comprando? (S ou N)");
        continua = input.next().charAt(0);

        while(continua == 'S'){
            System.out.println("Qual produto?");
            produto = input.nextLine();

            System.out.println("Qual valor?");
            valor = input.nextFloat();

            total = total + valor;
            quantitens++;
        }

        System.out.println("-----RECIBO-----\n"
        +"------------------------------");
        System.out.println("Total da compra...."+total);
        System.out.println("Valor medio da compra...."+total/quantitens);
        System.out.println("-----FINAL DE PROGRAMA-----");




    }
}
