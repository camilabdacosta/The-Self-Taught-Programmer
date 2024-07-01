package com.camilabdacosta.part_2;

//Escreva uma função que receba três parametros obrigatórios e dois parâmetros opcionais. 


/**
     * @param a  o primeiro número obrigatorio
     * @param b o segundo número obrigatorio
     * @param c o terceiro número obrigatorio
     * @param d o primeiro número  não obrigatorio
     * @param e o segundo número  não obrigatorio
     */

public class ch4_challenge3 {
    public static void main(String[] args) {
        funObrOuN(1,2,3,4,5);
        funObrOuN(1,2,3,null,null);
    }

    
    public static void funObrOuN(Integer a, Integer b, Integer c, Integer d, Integer e){
        if(d == null){
            d = 0;
        }
        if(e == null){
            e =0;
        }
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e);
    }
}
