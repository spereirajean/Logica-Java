package br.com.codigodebase_logica;

import java.util.Scanner;

public class ExercicioEnquanto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num, contador =1, res;
        System.out.println("Digite o número desejado a ser multiplicado");
        num = input.nextInt();



        while (contador <= 100){
            res = num * contador;
            System.out.println(res);

            contador ++;
        }
    }
}
