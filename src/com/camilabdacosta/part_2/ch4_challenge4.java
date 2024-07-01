package com.camilabdacosta.part_2;

/* Escreva um programa com duas funções. A primeira função deve receber um inteiro como parâmetro e retornar 
o resultado do inteiro dividido por 2. A segunda função deve receber um inteiro como parâmetro e retornar
o resultado do inteiro multiplicado por 4. Chame a primeira função, salve o resultado como uma variável 
e passe-a como parâmetro para a segunda função.
*/ 

    /**
     * @param num
     * @return num dividido por 2 e resultado vezes 4
     */

public class ch4_challenge4 {
    public static void main(String[] args) {
       int num =8;
       int resultadodiv = func1(num);
       int resultadofinal = func2(resultadodiv);

       System.out.println("Resultado "+ resultadofinal);
    }

    public static int func1(Integer num){
     return num/2;
    }


    public static int func2( Integer num){
    return num*4;
    }

}
