package net.internal.access;
import net.internal.c;
import net.internal.closed;

import java.util.Scanner;

public class Access {
    public static void main() {


    secure();

    Scanner inpStream;


    while (true) {
        inpStream = new Scanner(System.in);
        System.out.print("\n" + c.yw + "> ");


        switch (inpStream.next()) {

            case "exit":
                secure();
                System.out.println(c.wh + "Exiting database...\n\n");
                System.exit(0);

            case "closed":
                closed.interactive();
                break;

            default:
                System.out.print("\n" + c.rd + "Invalid");
                break;
        }
    }

    }

    public static void secure() {

            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    }
}
