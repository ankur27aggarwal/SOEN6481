package com.company;
import  java.util.Scanner ;

public class Main {

    double uservalue1, uservalue2;
    String operation;

    Main()

    {

    }

    public void answer() {

        getInput();
        double result = calculations(operation, uservalue1, uservalue2 );

        System.out.println("Your answer is " + result );
    }

    private void getInput() {

        int UserResponse ;
        Scanner scannerObject = new Scanner(System.in);
        Scanner UserInput = new Scanner(System.in);
        System.out.println("For basic calculation press 1 and for calculation regarding Gaussian Integral press 2");
        UserResponse = UserInput.nextInt();
        if (UserResponse==1) {
            System.out.println("Enter first number");
            uservalue1 = scannerObject.nextDouble();

            System.out.println("Enter second number");
            uservalue2 = scannerObject.nextDouble();
            System.out.println("\nHere are your options:");
            System.out.println("\n1. Addition, 2. Subtraction, 3. Divison, 4. Multiplication ");
            operation = UserInput.next();
        }
        else
        {

            System.out.println("\nHere are your options:");
            System.out.println("\n 5. Gaussian integral");
            operation = UserInput.next();



        }






    }

    public double  calculations(String mathoperation, double value1, double value2) {

        Scanner scannerObject = new Scanner(System.in);
        int valuein_5 ;
        int completesquare;
        int selector;
        switch (mathoperation)
        {   case "1":
            return (value1 + value2);

            case "2":
                return  (value1 - value2);

            case "3":
                return (value1 / value2);

            case "4":
                return (value1 * value2);
            case "5":
                System.out.print("\n If you just want the calculation for the Gaussian integral press 1 and For Error application press 2");
                selector=scannerObject.nextInt();
                if (selector==1) {


                    System.out.print("\n Enter the value of pi upto your choice of decimals:");
                    value1 = scannerObject.nextDouble();
                    System.out.print("\n If the power of exponential function is polynomial expression press 1 otherwise 2 :");
                    valuein_5 = scannerObject.nextInt();

                    double temporary;

                    double latestvalue = value1 / 2;

                    do {
                        temporary = latestvalue;
                        latestvalue = (temporary + (value1 / temporary)) / 2;
                    } while ((temporary - latestvalue) != 0);


                    if (valuein_5 == 2) {

                        value2 =latestvalue ;

                        return value2;
                    } else {
                        System.out.print("\n Enter the value making the expression whole square :");
                        completesquare = scannerObject.nextInt();
                        double temp;

                        double latestvalue2 = completesquare / 2;

                        do {
                            temp = latestvalue2;
                            latestvalue2 = (temp + (completesquare / temp)) / 2;
                        } while ((temp - latestvalue2) != 0);

                        double answer2 = latestvalue / latestvalue2;
                        return (answer2);


                    }
                }

                else {


                    System.out.print("\n Enter the value of pi upto your choice of decimals:");
                    value1 = scannerObject.nextDouble();
                    double temporary;

                    double latestvalue = value1 / 2;

                    do {
                        temporary = latestvalue;
                        latestvalue = (temporary + (value1 / temporary)) / 2;
                    } while ((temporary - latestvalue) != 0);

                    latestvalue = 2/latestvalue;
                    return (latestvalue);



                }
            default:
                throw new IllegalStateException("mathoperation is not valid");
        }
    }

    public static void main(String[] args)

    {
        Main calc = new Main();

        calc.answer();
    }

}
