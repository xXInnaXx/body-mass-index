package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService index = new BmiService();
        double mass = 60;
        double high = 160;
        double bodyMassIndex = index.calculate(mass, high);
        System.out.println(bodyMassIndex);
    }
}
