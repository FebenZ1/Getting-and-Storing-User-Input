import java.util.Scanner;
//Complete the following program. Use the Scanner class to read the
// following string into variables. Input String: "P Sherman 42 Wallaby Way Sydney"
// Variables: firstInitial,lastName, houseNumber,streetName,streetType,city
public class GettingStoringUserInput {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// bringing scanner to program so that it can accept user input

        String firstInitial, lastName, houseNumber, streetName, streetType, city;//declaring variables

        System.out.print("First Name:");
        firstInitial = keyboard.next();// initializing variables assigning => variable
        System.out.print("Last Name:");
        lastName = keyboard.next();
        System.out.print("House Number:");
        houseNumber = keyboard.next();
        System.out.print("Street Name:");
        streetName = keyboard.next();
        System.out.print("Street Type:");
        streetType = keyboard.next();
        System.out.print("City:");
        city = keyboard.next();

        System.out.println(" First Name:"  + firstInitial + " Last Name: " + lastName + " House Number: " + houseNumber + "");
        System.out.println(" Street Name :" + streetName + " Street Type: "  + streetType + " City: " + city);

        keyboard.close();
    }



}
