package students.Student.Brittany;
//    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//
//            if the number can be divisible by 3, 5 and 15,
public class lab03 {
    public static void main(String args[]) {
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }

}
