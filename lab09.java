package students.Student.Brittany;

import java.util.ArrayList;
import java.util.Arrays;
//        Given a list of people' names: "Amed", "hello", Eric", "mike".....
//        Write a java operation to remove all the names named hello

public class lab09 {
    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "Amed", "hello", "Eric", "mike") );

        System.out.println(namesList);

        namesList.remove(1);

        System.out.println(namesList);
    }


}
