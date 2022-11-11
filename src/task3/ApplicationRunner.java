package task3;

import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {
        State.Time = new Time();
        State.Altimeter = new Altimeter();
        State.Set_hours = new Set_hours();
        State.Set_min = new Set_min();
        State.current = new Time();

        while (true) {
            State.current.enter();
            State.current.update();
        }
    }

}

abstract class State {

    static State Time, Altimeter, Set_hours, Set_min, current;
    static int hours, mins;

    void enter() {

    }

    void update() {

    }

}

class Time extends State {

    void enter() {
        System.out.println("**************************************");
        System.out.println("             HILL WALKER");
        System.out.println("**************************************");
        System.out.println("              Mode: Time");
        System.out.println("          " + hours + " hours : " + mins + " minutes ");
        System.out.println("--------------------------------------");
    }

    void update() {
        while (true) {
            System.out.println("               SELECT");
            System.out.println("            MODE     SET");
            System.out.println("                EXIT");
            System.out.println("--------------------------------------");

            Scanner s = new Scanner(System.in);
            String input = s.next();
            String m_s = input.toUpperCase();
            switch (m_s) {
                case "MODE":
                    current = Altimeter;
                    return;
                case "SET":
                    current = Set_hours;
                    return;
                case "EXIT":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Please enter input from the menu.");
                    System.out.println("");
                    return;

            }
        }

    }

}

class Altimeter extends State {

    void enter() {
        System.out.println("**************************************");
        System.out.println("             HILL WALKER");
        System.out.println("**************************************");
        System.out.println("              Mode: Altimeter");
        System.out.println("         Altimeter: 1500 metres");
        System.out.println("---------------------------------");
    }

    void update() {
        while (true) {
            System.out.println("               SELECT");
            System.out.println("            MODE     SET");
            System.out.println("                EXIT");
            System.out.println("--------------------------------------");
            Scanner s = new Scanner(System.in);
            String input = s.next();
            String m_s = input.toUpperCase();
            switch (m_s) {
                case "MODE":
                    current = Time;
                    return;
                case "SET":
                    current = Altimeter;
                    return;
                case "EXIT":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Please enter input from the menu.");
                    System.out.println("");
                    return;
            }
        }

    }

}

class Set_hours extends State {

    void enter() {
        System.out.println("**************************************");
        System.out.println("             HILL WALKER");
        System.out.println("**************************************");
        System.out.println("              Mode: Hours");
        System.out.println("          " + hours + " hours : " + mins + " minutes ");
        System.out.println("--------------------------------------");
    }

    void update() {
        while (true) {
            System.out.println("               SELECT");
            System.out.println("            MODE     SET");
            System.out.println("                EXIT");
            System.out.println("--------------------------------------");
            Scanner s = new Scanner(System.in);
            String input = s.next();
            String m_s = input.toUpperCase();
            switch (m_s) {
                case "MODE":
                    current = Set_min;
                    return;
                case "SET":
                    current = Set_hours;
                    hours++;
                    return;
                case "EXIT":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Please enter input from the menu.");
                    System.out.println("");
                    return;
            }
        }

    }

}

class Set_min extends State {

    void enter() {
        System.out.println("**************************************");
        System.out.println("             HILL WALKER");
        System.out.println("**************************************");
        System.out.println("              Mode: Minutes");
        System.out.println("          " + hours + " hours : " + mins + " minutes ");
        System.out.println("--------------------------------------");
    }

    void update() {
        while (true) {
            System.out.println("               SELECT");
            System.out.println("            MODE     SET");
            System.out.println("                EXIT");
            System.out.println("--------------------------------------");
            Scanner s = new Scanner(System.in);
            String input = s.next();
            String m_s = input.toUpperCase();
            switch (m_s) {
                case "MODE":
                    current = Time;
                    return;
                case "SET":
                    current = Set_min;
                    mins++;
                    return;
                case "EXIT":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Please enter input from the menu.");
                    System.out.println("");
                    return;

            }
        }

    }

}
