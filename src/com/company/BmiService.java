package com.company;

public class BmiService {
    public double calculate(double mass, double high) {
        return mass / Math.pow(high, 2);
    }
}
