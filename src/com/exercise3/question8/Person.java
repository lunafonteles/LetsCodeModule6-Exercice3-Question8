package com.exercise3.question8;

public class Person {
    String name;
    double height;
    double weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double calculateIMC () {
        double IMC = weight/Math.pow(height, 2);
        return IMC;
    }

}
