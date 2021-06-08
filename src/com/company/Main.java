package com.company;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        System.out.println("entre hero name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        character character = new character();
        character.setCharecter(name, 1);
        haracteristic haracteristic = new haracteristic();
        System.out.println("choose race:");
        System.out.println("1-human");
        System.out.println("2-elf");
        System.out.println("3-orc");
        int chr = scanner.nextInt();
        if (chr == 1) {
            haracteristic.setHuman();
        }else if (chr == 2) {
            haracteristic.setElf();
        }else {
            haracteristic.setOrc();
        }
        }
    }

