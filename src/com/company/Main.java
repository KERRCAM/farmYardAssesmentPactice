package com.company;

public class Main {

    public static void main(String[] args) {

        animal myNewAnimal = new animal ("bob", 5, "spotted");
        cow myNewCow = new cow ("troy", 6, "bull", "yesterday");
        sheep myNewSheep = new sheep ("dolly", 4, "clone", "last week");

        System.out.println(myNewAnimal.toString());
        System.out.println(myNewCow.toString());
        System.out.println(myNewSheep.toString());

    }
}
