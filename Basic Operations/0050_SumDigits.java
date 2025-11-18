
import java.util.Scanner;

class Digit
{
    public static int sumDigits(int iNo)
    {
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
}

 class SumDigits
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number:");
        int iValue = sobj.nextInt();

        int iRet = Digit.sumDigits(iValue);

        System.out.println("Summation of digits is : " + iRet);

        sobj.close();
    }
}















// #include<stdio.h>

// int SumDigits(int iNo)
// {
//     int iSum = 0;
//     int iDigit = 0;

//     while(iNo != 0)
//     {
//         iDigit = iNo % 10;
//         iSum = iSum + iDigit; 
//         iNo = iNo / 10;
//     }
//     return iSum;
// }

// int main()
// {
//     int iValue = 0, iRet = 0;

//     printf("Enter number : \n");
//     scanf("%d",&iValue);

//     iRet = SumDigits(iValue);

//     printf("Summation of digits are : %d\n",iRet);

//     return 0;
// }