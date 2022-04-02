## Lab 01 -  (String) Find the unique
    //    Write a return  method that can find the unique characters from the String
    //
    //    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";  

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the required String: ");
String str = sc.next();
System.out.println("Enter the required character: ");
char ch = sc.next().toCharArray()[0];
 int i = str.indexOf(ch);
if(i!=-1) {
System.out.println("Sting contains the specified character");
} else {
System.out.println("String doesn’t contain the specified character");
}
}
}
