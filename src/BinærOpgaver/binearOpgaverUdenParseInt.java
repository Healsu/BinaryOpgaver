package BinærOpgaver;

import java.util.Scanner;

public class binearOpgaverUdenParseInt {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double result = 0;

        System.out.println("Binary here: ");
        String userInput = scanner.nextLine();


        try {
            //Check if the string only contain 0's and 1's
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) != '1' && userInput.charAt(i) != '0') {

                    throw new Exception();
                }

            }
            //Since the method needs a double and our userInput is a string we want to convert it
            //I know i used a parseInto in this which kinda defeats the file name but........yeah
            double doubleValue = Double.parseDouble(userInput);
            System.out.println(binaryToDecimal(doubleValue));



        }
        catch(Exception e){
            System.out.println("The binary isnt only made of 1 and 0");
        }
    }
    //Convert binary to decimal
    public static double binaryToDecimal(double value){

        int decimal = 0;
        int p = 0;
        while(true){
            if(value == 0){
                break;
            } else {
                double times = value%10;
                decimal += times*Math.pow(2, p);
                value = value/10;
                p++;
            }
        }
        return decimal;
    }
    }

