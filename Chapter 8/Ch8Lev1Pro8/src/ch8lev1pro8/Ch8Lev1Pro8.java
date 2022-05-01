/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8lev1pro8;

/**
 *
 * @author Farhad
 */
import java.util.*;

class Ch8Lev1Pro8 {

    private static final String BLANK = "a";

    private String name;

    private String room;

    private String pwd;

    private Scanner scanner;

    public Ch8Lev1Pro8() {

        name = BLANK;

        room = BLANK;

        pwd = BLANK;

        scanner = new Scanner(System.in);

    }

    public boolean getInput() {

        System.out.print("Enter Name:");

        name = scanner.nextLine();

        if ("Admin".equals(name.trim())) {

            return false;

        }

        System.out.print("Enter Room No.:");

        room = scanner.nextLine();

        if ("X123".equals(room.trim())) {

            return false;

        }

        System.out.print("Enter Password:");

        pwd = scanner.nextLine();

        if ("$maTrix%TwO$".equals(pwd.trim())) {

            return false;

        }

        return true;

    }

    public String getName() {

        return name;

    }

    public String getRoom() {

        return room;

    }

    public String getPassword() {

        return pwd;

    }

    public static void main(String[] args) {

        Ch8Lev1Pro8 ob = new Ch8Lev1Pro8();

        if (ob.getInput()) {

            System.out.print("Inputs are valid");

        } else {

            System.out.print("Inputs are not valid");

        }

    }

}
