package com.camilabdacosta.part_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ch5_challenge4 {
    public static void main(String[] args) {
        Map<String, String> meusAtributos = new HashMap<>();
        meusAtributos.put("height", "6");
        meusAtributos.put("fav_color", "red");
        meusAtributos.put("fav_author", "Orwell");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite height, fav_color ou fav_author: ");
        String answer = scanner.nextLine();

        if (meusAtributos.containsKey(answer)) {
            String result = meusAtributos.get(answer);
            System.out.println("Resultado: " + result);
        } else {
            System.out.println("Atributo não encontrado.");
        }
        scanner.close();
    }
}
