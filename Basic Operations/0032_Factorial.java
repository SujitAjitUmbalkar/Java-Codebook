
import java.util.Scanner;

class FactorialCalculator
{
    public static final long ERR_INVALID = -1;

    public static long factorial(int number)
    {
        if(number < 0)
        {
            return ERR_INVALID;
        }

        long fact = 1;
        for(int i = number; i >= 1; i--)
        {
            fact *= i;
        }

        return fact;
    }
}

 class Factorial
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sobj.nextInt();

        long result = FactorialCalculator.factorial(value);

        if(result == FactorialCalculator.ERR_INVALID)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Factorial is: " + result);
        }

        sobj.close();
    }
}











// #include<stdio.h>

// #define ERR_INVALID -1

// unsigned long Factorial(unsigned int iNo)
// {
//     int iCnt = 0;
//     unsigned long iFact = 1;

//     if(iNo < 0)
//     {
//         return ERR_INVALID;
//     }

//     for(iCnt = iNo; iCnt >= 1; iCnt--)
//     {
//         iFact = iFact * iCnt;
//     }

//     return iFact;
// }

// int main()
// {
//     unsigned int iValue = 0;
//     unsigned long iRet = 0;
    
//     printf("Enter number : \n");
//     scanf("%u",&iValue);

//     iRet = Factorial(iValue);
//     if(iRet == ERR_INVALID)
//     {
//         printf("Invalid input\n");
//     }
//     else
//     {
//         printf("Factorial is : %lu\n",iRet);
//     }
    
//     return 0;
// }