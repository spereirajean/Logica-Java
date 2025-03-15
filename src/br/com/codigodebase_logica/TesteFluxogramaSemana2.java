package br.com.codigodebase_logica;

import java.util.Scanner;

public class TesteFluxogramaSemana2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1, nota2;

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextInt();

        System.out.println("Agora digite a segunda nota:");
        nota2 = input.nextInt();

        float media = (nota1 + nota2) / 2;

        System.out.println("A média da nota é:" + media);
    }
}
