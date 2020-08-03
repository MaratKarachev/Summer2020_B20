package Replits;

import java.util.Scanner;

public class BuildRoute {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String route = "";
        switch (start) {
            case "A":
                switch (end) {
                    case "A":
                        route += "A found";
                        break;
                    case "B":
                        route += "right: B found";
                        break;
                    case "C":
                        route += "right > down: C found";
                        break;
                    case "D":
                        route += "right > down> left: D found";
                        break;
                }
                System.out.println(route);

        }

        switch (start) {
            case "B":
                switch (end) {
                    case "B":
                        route += "B found";
                        break;
                    case "C":
                        route += "down: C found";
                        break;
                    case "D":
                        route += "down > left: D found";
                        break;
                    case "A":
                        route += "down > left > up: A found";
                        break;
                }
                System.out.println(route);

        }

        switch (start) {
            case "C":
                switch (end) {
                    case "C":
                        route += "C found";
                        break;
                    case "D":
                        route += "left: D found";
                        break;
                    case "A":
                        route += "left > up: A found";
                        break;
                    case "B":
                        route += "left > up > right: B found";
                        break;
                }
                System.out.println(route);

        }

        switch (start) {
            case "D":
                switch (end) {
                    case "D":
                        route += "D found";
                        break;
                    case "A":
                        route += "up: A found";
                        break;
                    case "B":
                        route += "up > right: B found";
                        break;
                    case "C":
                        route += "up > rigth > down: C found";
                        break;
                }
                System.out.println(route);

        }
    }
}



