package net.internal;

import java.util.Scanner;

public interface closed {


    static void fire_1 () {
        System.out.print(c.rd + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWe are closed.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.exit(0);
    }


    static void fire_2 () {
        System.out.print(c.rd + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWe are closed.\n\n\n\n\n");
        System.exit(0);
    }


    static void fire_3 () {

        Scanner wait = new Scanner(System.in);
        System.out.print(c.rd + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWe are closed.\n\n");
        while (true) {
            wait.nextLine();
        }

    }

    static void fire_4 () {

        Scanner wait = new Scanner(System.in);
        System.out.print(c.rd + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWe are closed.\n\n");
        while (true) {
            wait.nextLine();
            System.out.print(c.rd + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWe are closed.\n\n");
        }

    }

    static void custom_1 (String custom) {

        System.out.println(c.rd + custom);
        System.exit(0);
    }

    static void custom_2 (String custom) {

        System.out.print(custom);
        System.exit(0);
    }


    static void custom_3 (String custom) {
        Scanner wait = new Scanner(System.in);

        System.out.print(custom);
        System.exit(0);

        while (true) {
            wait.nextLine();
        }

    }


    static void custom_4 (String custom) {
        Scanner wait = new Scanner(System.in);

        System.out.print(c.rd + custom);
        System.exit(0);

        while (true) {
            wait.nextLine();
        }

    }


    static void custom_5 (String custom) {
        Scanner wait = new Scanner(System.in);

        System.out.print(custom);

        while (true) {
            wait.nextLine();
            System.out.print(custom);
        }

    }


    static void custom_6 (String custom) {
        Scanner wait = new Scanner(System.in);

        System.out.print(c.rd + custom);

        while (true) {
            wait.nextLine();
            System.out.print(c.rd + custom);
        }

    }



    static void interactive () {

        Scanner sc = new Scanner(System.in);
        System.out.print(c.cy + "Custom closed message: ");
        String custom = sc.nextLine();

        Scanner wait = new Scanner(System.in);
        System.out.print("\n\n" + c.rd + custom + "\n\n");

        while (true) {
            wait.nextLine();
            System.out.print("\n\n\n" + c.rd + custom + "\n\n\n");
        }

    }



}


