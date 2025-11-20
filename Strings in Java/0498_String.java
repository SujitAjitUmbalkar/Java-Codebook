import java.util.*;

class program498
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int i = 0;
        int Count[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')           // condition for lower case characters
            {
               Count[Arr[i]- 'a']++;         
            }
        } 

        for(i = 0; i < 26; i++)
        {
            if(Count[i] != 0)
            {
                System.out.println("Frequency of "+(char)(i+'a')+" is : "+Count[i]);
            }
        }

        sobj.close();
    }
}

