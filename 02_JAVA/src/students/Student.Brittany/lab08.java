package students.Student.Brittany;

public class lab08 {
    //    Write a return method that returns the
    //Fibonacci of any given number
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        int n = 7;
        System.out.println(fib(n));
    }
}

