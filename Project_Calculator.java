import java.util.Scanner; //Imports Scanner Class used for User Input

class Project_Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner Object

        System.out.println("Please choose what function you want to do");
        int function = myObj.nextInt();

        if (function == 1) { //Checks if the user selects 1 for addition
            System.out.println("You have choosen addition");

            System.out.println("Please enter the first value"); //User input for values
            int value1 = myObj.nextInt(); //Reads user input as a int

            System.out.println("Please enter the second value"); //User input for values
            int value2 = myObj.nextInt(); //Reads user input as a int

            int sum = value1 + value2;
            System.out.println("The Sum of the numbers is: " + sum); //Prints the sum of the 2 values
        } 
        else if (function == 2) { //Checks if the user selects 2 for subtraction
            System.out.println("You have choosen subtraction");

            System.out.println("Please enter the first value"); //User input for values
            int value1 = myObj.nextInt(); //Reads user input as a int

            System.out.println("Please enter the second value"); //User input for values
            int value2 = myObj.nextInt(); //Reads user input as a int

            int sum = value1 - value2; 
            System.out.println("The Sum of the numbers is: " + sum); //Prints the sum of the 2 values
        }
        else if (function == 3) { //Checks if the user selects 3 for multiplication
            System.out.println("You have choosen multiplication");

            System.out.println("Please enter the first value"); //User input for values
            int value1 = myObj.nextInt(); //Reads user input as a int

            System.out.println("Please enter the second value"); //User input for values
            int value2 = myObj.nextInt(); //Reads user input as a int

            int sum = value1 * value2; 
            System.out.println("The Sum of the numbers is: " + sum); //Prints the sum of the 2 values
        }
        else if (function == 4) { //Checks if the user selects 4 for division
            System.out.println("You have choosen division");

            System.out.println("Please enter the first value"); //User input for values
            int value1 = myObj.nextInt(); //Reads user input as a int

            System.out.println("Please enter the second value"); //User input for values
            int value2 = myObj.nextInt(); //Reads user input as a int

            int sum = value1 / value2; 
            System.out.println("The Sum of the numbers is: " + sum); //Prints the sum of the 2 values
        }
        else { //Checks if the user doesn't use an avaliable function
            System.out.println("You have not choosen a usable function");
        }
    }
}
