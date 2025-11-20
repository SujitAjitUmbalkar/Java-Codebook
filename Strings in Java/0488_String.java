import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, iStart = 0, iEnd = 0;

        char Arr[] = str.toCharArray(); // _ _ _JAY_ _GANESH_ _ _

        if(Arr[0] == ' ')
        {
            while((Arr[i] == ' ') && (i < Arr.length))
            {
                i++;
            }
        }

        iStart = i;
        
        i = Arr.length-1;
        
        if(Arr[Arr.length-1] == ' ')
        {            
            while(Arr[i] == ' ')
            {
                i--;
            }
        }

        iEnd = i;
        
        char Brr[] = new char[iEnd-iStart+1];
        int j = 0;

        for(i = iStart, j = 0; i <= iEnd; i++, j++)
        {
            Brr[j] = Arr[i];
        }

        // converting array in string and returning it 
        return new String(Brr);     // shortcut 

        // String Brr1 = new String(Brr);
        // return Brr1;
    }
}

class String_0488
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char Arr[] = {'a','b','c','d','e','f'};
        
        // converting array to string (default) 
        String s = new String(Arr);

        System.out.println("converting array to string (default) : " + s);

        // converting array to string (with parameters) 
       String s1 = new String(Arr,1,4);
    

        System.out.println("converting array to string (with offset 1 , count 4 ): "+ s1);
        sobj.close();

    }
}