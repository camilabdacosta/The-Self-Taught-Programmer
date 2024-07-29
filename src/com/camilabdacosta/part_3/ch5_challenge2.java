package com.camilabdacosta.part_3;


public class ch5_challenge2 {
    private double latitude;
    private double longitude;

    public ch5_challenge2(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static void main(String[] args) {
        ch5_challenge2 saoPaulo = new ch5_challenge2(-23.550520, -46.633308);
        System.out.println("Latitude: " + saoPaulo.getLatitude() + ", Longitude: " + saoPaulo.getLongitude());
   } 
}
