package br.com.codigodebase_logica;

import java.util.Scanner;

public class TesteSemana2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n1, n2;

        System.out.println("Digite o número 1:");
        n1 = input.nextInt();

        System.out.println("Digite o número 2");
        n2 = input.nextInt();

        if (n1 > n2){
            System.out.println("Primeiro numero é maior");
        }else{
            System.out.println("Segundo numero é maior");
        }

    }
}
