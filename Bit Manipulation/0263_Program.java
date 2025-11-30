import java.util.Scanner;

class Program0263 
{

    public static void DisplayBinary(int iNo) {
        int iDigit = 0;
        
        System.out.println("Binary conversion is : ");

        while(iNo != 0) {
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo / 2;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        DisplayBinary(iValue);
        
        sc.close();
    }
}