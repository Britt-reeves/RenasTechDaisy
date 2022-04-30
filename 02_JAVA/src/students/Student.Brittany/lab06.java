package students.Student.Brittany;

public class lab06 {
    //    Write a return method that returns the
    //factorial number of any given number
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

     public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(5));
    }
}

