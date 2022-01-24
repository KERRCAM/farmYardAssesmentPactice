package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter name");
        Scanner input = new Scanner(System.in);

        String animalName = input.next();

        animal myNewAnimal = new animal (animalName, 5, "spotted");
        cow myNewCow = new cow ("troy", 6, "bull", "yesterday");
        sheep myNewSheep = new sheep ("dolly", 4, "clone", "last week");

        System.out.println(myNewAnimal.toString());
        System.out.println(myNewCow.toString());
        System.out.println(myNewSheep.toString());

    }
}
