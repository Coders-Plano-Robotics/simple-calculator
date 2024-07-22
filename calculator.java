import java.util.Scanner; // The Scanner class allows us to get user input

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Creating the Scanner Object
        System.out.println("Add, Subtract, Multiply, or Divide: ");
        String operation = myScanner.nextLine(); // Take in User Input

        System.out.println("Enter the first number: ");
        int num1 = myScanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = myScanner.nextInt();

        if (operation.equals("Add")) {
          System.out.println(num1 + num2);
        }
        //Subtraction
        /*
            Complete this operation here
        */

        //Multiplication
        /*
            Complete this operation here
        */

        //Division
        /*
            Complete this operation here
        */
        //Extra Credit: How Would You Go About Error Handling??

                
    }
}

//https://www.programiz.com/java-programming/online-compiler/

