package br.com.codigodebase_logica;

import java.util.Scanner;

public class Teste2Semana2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Qual a base do triângulo?");
        base = input.nextFloat();

        System.out.println("Qual a altura do triângulo?");
        altura = input.nextFloat();

        area = base * altura;
        area = area / 2;

        System.out.println("Area do triângulo: " + area);

    }
}
