package com.mycompany.exercicio15;

import java.util.Scanner;


public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Idade: ");
        String num1 = n1.nextLine();
        
        int idade = Integer.parseInt(num1);
        
        if(idade >= 15 && idade <= 25){
            System.out.println("Aceita");
        } else{
            System.out.println("Não aceita");
        }
    }
}
