package com.camilabdacosta.part_2;

import java.util.Scanner;

public class ch4_challenge5 {
    /**
     *  Escreva uma função que converta uma string 
     * em um float e retorne o resultado. Use a manipulação de exceções para capturar a exceção que pode ocorrer.
     */

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite algo: ");
            String str = sc.nextLine();
            sc.close();
            float valor = Float.valueOf(str);
            System.out.println(valor);
        } catch (Exception e) {
            System.out.println("Algo deu errado");
        }
    }
}
