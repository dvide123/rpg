package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("entre name:");
        String name = scaner.next();
        System.out.println("entre class:");
        String CLASS = scaner.next();
        System.out.println("entre race:");
        String Race = scaner.next();
        character characterOne = new character(name, CLASS, Race);

    }
}

