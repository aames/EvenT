package net.ajed.event;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        // Create new EventService and start up the REST API
        // Set the startup time, so we can report it later
        Date startDate = new Date(); // Set start date
        banner();
        // read the app config
        // read the db config
        // connect to the db
        // start the API

        Date endDate = new Date();
        long duration = endDate.getTime() - startDate.getTime();
        System.out.printf("Startup took: %d Seconds.\n", TimeUnit.MILLISECONDS.toSeconds(duration) );
        System.out.println("Ready for connections!");
        menu();
    }

    public static void banner(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("#######                      #######     #####");
        System.out.println("#       #    # ###### #    #    #       #     # ###### #####  #    # ###### #####");
        System.out.println("#       #    # #      ##   #    #       #       #      #    # #    # #      #    #");
        System.out.println("#####   #    # #####  # #  #    #        #####  #####  #    # #    # #####  #    #");
        System.out.println("#       #    # #      #  # #    #             # #      #####  #    # #      #####");
        System.out.println("#        #  #  #      #   ##    #       #     # #      #   #   #  #  #      #   #");
        System.out.println("#######   ##   ###### #    #    #        #####  ###### #    #   ##   ###### #    #");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void menu(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter a command, such as reload or exit.");
            String input = s.nextLine();
            if (input.toLowerCase().contains("exit")) {
                shutdown();
                break;
            } else if (input.toLowerCase().contains("reload")){
                reloadConfigFiles();
            } else if (input.toLowerCase().contains("help")){
                System.out.println("Commands are:");
                System.out.println("\t reload : stops the application and reloads configuration files to apply any changes.");
                System.out.println("\t exit : stops the application after closing database connections.");
            } else {
                System.out.println("Command not recognized, try again? Or use help.");
            }
        }
    }

    public static void shutdown(){
        // TODO: Complete shutdown actions
        // close API
        // close DB connections
    }
    public static void reloadConfigFiles(){
        // TODO: Complete

    }
}
