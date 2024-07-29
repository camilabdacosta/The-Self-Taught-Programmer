package com.camilabdacosta.part_3;

import java.util.HashMap;
import java.util.Map;

public class ch5_challenge3 {
    public static void main(String[] args) {
         Map<String, String> meusAtributos = new HashMap<>();

        meusAtributos.put("altura", "1,67");
        meusAtributos.put("corFavorita", "preto");
        meusAtributos.put("autorFavorito", "Stephen King");

        System.out.println("Altura: " + meusAtributos.get("altura"));
        System.out.println("Cor favorita: " + meusAtributos.get("corFavorita"));
        System.out.println("Autor favorito: " + meusAtributos.get("autorFavorito"));
    }
}
