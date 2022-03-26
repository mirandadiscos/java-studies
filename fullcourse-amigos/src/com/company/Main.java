package com.company;

//import lib for use date type
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char a = 'A';
        System.out.println("hello world");
        Date date = new Date();
    //Non primitive data types
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        Person p1 = new Person("Victor");
        Person p2 = p1;//same memory address of p1

        System.out.println(p1.name);
        System.out.println(p2.name);

        p1.name = "Victorino";

        System.out.println(p2.name);

    }
    static class Person {
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
//to compile:
//  attention to the folder
//vito in ~/projects-java/fullcourse-amigos/src/com/company λ javac Main.java
//to execute:
//  attention on the path
//vito in ~/projects-java/fullcourse-amigos/src λ java com.company.Main
