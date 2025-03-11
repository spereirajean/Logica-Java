package br.com.codigodebase_logica;

import java.util.Scanner;

public class Teste2Semana1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String  nome;
        int salario;
        int novo_salario;


        System.out.println("Qual seu nome?");
        nome = input.nextLine();

        System.out.println("Qual seu Salario ? ");
        salario = input.nextInt();

        novo_salario = salario * 2;

        System.out.println("Seu novo salario = " +novo_salario);

    }

}

