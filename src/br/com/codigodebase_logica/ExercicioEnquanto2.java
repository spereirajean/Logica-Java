package br.com.codigodebase_logica;

import java.util.Scanner;

    public class ExercicioEnquanto2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double num, contador =100, res;
            System.out.println("Digite o número desejado a ser subtraido");
            num = input.nextInt();



            while (contador > 0){
                res = num - contador;
                System.out.println(res);
                contador-=2;
            }
        }
    }

