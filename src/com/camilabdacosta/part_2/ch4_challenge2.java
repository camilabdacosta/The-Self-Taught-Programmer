package com.camilabdacosta.part_2;

import java.util.Scanner;

//Crie um programa que receba uma string como parametro e exiba
public class ch4_challenge2 {

    public static void main(String[] args) {
        funString();

    }

    public static void funString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str);
    }
}
