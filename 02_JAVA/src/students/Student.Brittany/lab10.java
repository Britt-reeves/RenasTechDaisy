package students.Student.Brittany;

public class lab10 {
    //    Write a method that can sort the ArrayList
    //n descending order without using the sort method
    public static void main(String[] args)
    {
        int[] arr = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
