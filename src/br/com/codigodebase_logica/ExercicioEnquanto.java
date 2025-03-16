package br.com.codigodebase_logica;

import java.util.Scanner;

public class ExercicioEnquanto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;
        System.out.println("Digite o número desejado a ser multiplicado");
        num = input.nextInt();

        while (num < 100){
            num ++;
            System.out.println(num);
        }
    }
}
