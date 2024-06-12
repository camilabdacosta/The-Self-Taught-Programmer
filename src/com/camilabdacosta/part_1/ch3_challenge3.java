package com.camilabdacosta.part_1;

//Pagina 56 cap 3
/* 3 Escreva um programa que exiba uma mensagem se uma variável for menor ou
igual a 10, outra mensagem se a variável for maior do que 10, mas menor ou
igual a 25, e ainda outra mensagem se a variável for maior do que 25.*/ 

public class ch3_challenge3 {
    public static void main(String[] args) {
        int x = 11;
        if (x <= 10) {
            System.out.println("x menor ou igual a 10");
        }
        else if(x <=25) {
            System.out.println("x maior que 10 e menor ou igual a 25");
        }else {
            System.out.println("x maior que  25");

        }

    }
}
