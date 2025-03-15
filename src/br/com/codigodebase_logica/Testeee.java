package br.com.codigodebase_logica;

import java.util.Scanner;

public class Testeee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String sistema;

        System.out.println("Qual é o seu nome?");
        nome = input.nextLine();

        System.out.println("Qual é o sistema operacional do seu" +
                " telefone móvel? (Android ou IOS)");
        sistema = input.nextLine();

        if(sistema.equals("Android"))
        {
            System.out.println("Atendemos");
        }else if(sistema.equals("Ios")){
            System.out.println("Atendemos");
        } else{
            System.out.println("Sinto - Não atendemos");
        }
    }
}
