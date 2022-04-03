/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter8lev1pro7;

import java.util.Scanner;

/**
 *
 * @author Farhad
 */

public class chapter8lev1pro7 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        InputHandler iH = new InputHandler();

        iH.getInput();

        System.out.print("Name Checking " + iH.getName());

    }
    
}

class InputHandler {

    private static final String BLANK = "a";

    private String name;

    private String room;

    private String pwd;

    private Scanner scanner;

    EmptyInputException ex = new EmptyInputException();

    public InputHandler() {

        name = BLANK;

        room = BLANK;

        pwd = BLANK;

        scanner = new Scanner(System.in);

    }

    public void getInput() {

        System.out.print("Enter Name:");

        name = scanner.nextLine();

        ex.checkEligibilty(name, "Name");

        System.out.print("Enter Room No.:");

        room = scanner.nextLine();

        ex.checkEligibilty(room, "Room");

        System.out.print("Enter Password:");

        pwd = scanner.nextLine();

        ex.checkEligibilty(pwd, "Password");

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



}

class EmptyInputException {

    public void checkEligibilty(String input, String inputType) {
        if (input.trim().length() == 0) {
            throw new ArithmeticException(inputType + " is empty");

        }

        else {

            System.out.println(inputType + " is valid and size is: " + input.length());

        }

    }

}