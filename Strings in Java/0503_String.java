import java.util.*;

class program503
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll(" ","");

        System.out.println(str);

        sobj.close();
    }
}


/*
// Strings in Java are immutable.
// replaceAll() creates a new modified string and returns it.
// We reassign it to 'str' to update the reference to the new string.

 */