
import java.util.Scanner;

class PrimeChecker
{
    public static boolean checkPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0 || iNo == 1)
        {
            return false;
        }

        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                break;
            }
        }

        return (iCnt > (iNo / 2));
    }
}

 class Prime
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int value = sobj.nextInt();

        boolean result = PrimeChecker.checkPrime(value);

        if(result == true)
        {
            System.out.println(value + " is a prime number");
        }
        else
        {
            System.out.println(value + " is not a prime number");
        }

        sobj.close();
    }
}



















// 0#include<stdio.h>
// #include<stdbool.h>

// bool CheckPrime(int iNo)
// {
//     int iCnt = 0;

//     if(iNo < 0)
//     {
//         iNo = -iNo;
//     }

//     for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
//     {
//         if((iNo % iCnt) == 0)
//         {
//             break;
//         }
//     }
    
//     return (iCnt > (iNo/2));
// }

// int main()
// {
//     int iValue = 0;
//     bool bRet = false;

//     printf("Enter number : \n");
//     scanf("%d",&iValue);

//     bRet = CheckPrime(iValue);

//     if(bRet == true)
//     {
//         printf("%d is prime number\n",iValue);
//     }
//     else
//     {
//         printf("%d is not a prime number\n",iValue);
//     }
//     return 0;
// }