package com.exercise3.question8;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] person = new Person[2];
        String name = "";
        double height;
        double weight;
        double IMC;
        String[] outOfIdealWeight = new String[2];
        boolean empty = true;

        for (int i = 0; i<person.length; i++) {
            System.out.println("Informe o nome da pessoa " + (i+1));
            name = scanner.next();
            System.out.println("Informe a altura em metros da pessoa " + (i+1));
            height = scanner.nextDouble();
            System.out.println("Informe o peso da pessoa " + (i+1));
            weight = scanner.nextDouble();
            person[i] = new Person(name, height, weight);
            IMC = person[i].calculateIMC();

            if(IMC > 25 || IMC <18.5) {
                outOfIdealWeight[i] = person[i].name;
            }
        }
        for(String prop : outOfIdealWeight) {
            if (prop != null) {
                empty = false;
                break;
            }
        }

        if(empty == false) {
            for(int i = 0; i < outOfIdealWeight.length; i++) {
                if(outOfIdealWeight[i]!=null) {
                    System.out.println(outOfIdealWeight[i] + " está fora do peso ideal.");
                }
            }

        } else {
            System.out.println("Todos estão dentro do peso ideal");
        }
    }
}
