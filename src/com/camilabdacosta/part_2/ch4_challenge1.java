package com.camilabdacosta.part_2;

import java.util.Scanner;

//Escreva uma função que receba um numero e escreva ele ao quadrado

public class ch4_challenge1 {
    public static void main(String[] args) {
        funInteger();

    }

    public static void funInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Integer num = sc.nextInt();

        Double quadrado = (Math.pow(num, 2));

        System.out.println("O numero ao quadrado é: " + quadrado);
        sc.close();

    }

}
