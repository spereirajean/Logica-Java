package br.com.codigodebase_logica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioEouOU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cargo, departamento;
        int idade;

        System.out.println("Qual o seu cargo?");
        cargo = input.nextLine();

        System.out.println("Qual o seu departamento?");
        departamento = input.nextLine();

        System.out.println("Qual sua idade?");
        idade = input.nextInt();

        if (cargo.equals("Gerente") && departamento.equals("TIC") && idade >=60) {
            System.out.println("Você irá receber um bônus plus!");
        }else{
            System.out.println("Você irá receber um bônus!");
        }
    }
}
