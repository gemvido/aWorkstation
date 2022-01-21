package net.version;

import net.internal.c;
import java.util.Scanner;

public interface enforceVersion {



    static void fire() {

        Scanner wait = new Scanner(System.in);

        String apiConnection = "false";

        try {

            apiConnection = URLreader.check("https://raw.githubusercontent.com/afkvido/aWorkstation-API/master/src/API.yml");

        } catch (Exception ignored) {}


        if (apiConnection.equals("false")) {
            System.out.println(c.rd + "Cannot connect to aWorkstation API\nMake sure you're on the latest version of aWorkstation");
            wait.nextLine();
            System.exit(0);
        } else if (!apiConnection.equals("api\n")) {
            System.out.println(c.rd + "API error, make sure you're on the latest version of aWorkstation" + c.rs);
            wait.nextLine();
            System.exit(0);
        }




        String latest = "waiting";

        try {
            latest = URLreader.check("https://raw.githubusercontent.com/afkvido/aWorkstation-API/master/src/api/latest.yml");
        } catch (Exception ignored) {}

        if (latest.equals("waiting")) {

            System.out.println(c.rd + "API error, make sure you're on the latest version of aWorkstation" + c.rs);
            wait.nextLine();
            System.exit(0);

        } else if (!(Version.Version + "\n").equals(latest)) {
            System.out.println(c.yw + "You are running aWorkstation " + c.cy + Version.Version + c.yw + ", the latest version is " + c.cy + latest.replace("\n", "") + c.yw + ".");
            System.out.println(c.rd + "You are on an unsupported version of aWorkstation. \nMake sure you're on the latest version of aWorkstation" + c.rs);
            System.out.println(c.cy + "Download the latest version of aWorkstation: [link]");
            wait.nextLine();
            System.exit(0);
        }



    }



}
