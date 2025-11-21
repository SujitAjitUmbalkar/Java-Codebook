import java.util.*;

/*
// This program checks whether two strings are anagrams or not.
// It uses a single Count[26] array to track frequency differences.
// For each character in first string -> increment count
// For each character in second string -> decrement count
// If all counts become zero, both strings are anagrams.

*/

class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        boolean bFlag = true;
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        // Convert both to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();        // 50
        char Brr[] = str2.toCharArray();        // 50
            
        int Count[] = new int[26];             // 104

        for(i = 0; i < Arr.length; i++)         // 50
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
               Count[Arr[i]- 'a']++;         
            }

            if(Brr[i] >= 'a' && Brr[i]<= 'z')
            {
               Count[Brr[i]- 'a']--;         
            }
        } 

        for(i = 0; i < 26; i++)             // 26
        {
            if(Count[i] != 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

class program502
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = Marvellous.CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }

        sobj.close();
    }
}

