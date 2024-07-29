package com.camilabdacosta.part_3;

import java.util.HashMap;
import java.util.Map;

public class ch5_challenge5 {
       public static void main(String[] args) {
        Map<String, String> songs = new HashMap<>();
        songs.put("John Lennon", "Stand by Me");
        songs.put("Kanye West", "Homecoming");
        songs.put("Swedish House Mafia", "Don't You Worry Child");

        System.out.println("Música de John Lennon: " + songs.get("John Lennon"));
        System.out.println("Música de Kanye West: " + songs.get("Kanye West"));
        System.out.println("Música de Swedish House Mafia: " + songs.get("Swedish House Mafia"));
    }
}
