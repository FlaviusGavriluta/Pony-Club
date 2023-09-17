package org.example;

import org.example.enums.PonyType;
import org.example.model.Coordinate;
import org.example.model.Pony;
import org.example.model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Software software = new Software();

        Pony myPony = new Pony("Gigel", PonyType.PEGASUS);
        Pony myPony1 = new Pony("Gigel2", PonyType.NORMAL);
        Pony myPony2 = new Pony("Gigel3", PonyType.UNICORN);
        Pony myPony3 = new Pony("Gigel4", PonyType.SUPERPONY);

//        System.out.println(myPony.getPosition());
        myPony2.ability();
        myPony2.ability();
        //        System.out.println(myPony.getPosition());

        User newUser = new User("Flv", LocalDate.parse("2023-08-08"));
        User newUser1 = new User("Flv1", LocalDate.parse("2023-09-08"));


        software.addUser(newUser);
        software.addUser(newUser1);

        newUser.addPony(myPony);
        newUser.addPony(myPony1);
        newUser.addPony(myPony2);

        newUser1.addPony(myPony3);

        System.out.println(newUser);
        System.out.println(newUser1);

        // TEMA DE CASA:  software.listAllPonies(new Coordinate(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));

        software.userWithHighestLevel();
    }
}