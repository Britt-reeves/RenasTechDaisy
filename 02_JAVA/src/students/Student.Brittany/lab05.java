package students.Student.Brittany;

import java.util.Scanner;

public class lab05 {
    //    Write a method that can return
    //the sum of the digits in a string
    private static int sumOfdigits(String number) {
         int sum = 0;

        char ch ;
        int n;

         for(int i=0; i<number.length(); i++) {

             ch = number.charAt(i);

             if(Character.isDigit(ch)) {

                 n = Character. getNumericValue(ch);

                 sum += n;
            }
        }

         return sum;
    }

    public static void main(String[] args) {

         String str = null;
        int sum = 0;


        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter String:: ");
        str = scan.next();

        sum = sumOfdigits(str);

        System.out.println("The sum of "
                +" digits in the string "+str
                +" = "+ sum);

        scan.close();
    }
}

