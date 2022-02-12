package BinærOpgaver;

import java.util.Scanner;

public class binearOpgaverToString {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Type in a binary number: ");
        String num = scanner.nextLine();

        try{
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) != '0' && num.charAt(i) != '1'){
                    throw new Exception();
                }
            }
            System.out.println("Output: "+Integer.parseInt(num,2));

        }
        catch(Exception e){
            System.out.println("The typed binary wasn't only made of 1's and 0's");
        }
    }
}
