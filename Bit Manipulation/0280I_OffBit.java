import java.util.Scanner;

class Program0280I 
{

    public static int OffBit(int iNo, int iPos) {
        int iMask = 0x1;
        int iResult = 0;
        
        iMask = iMask << (iPos - 1);
        iMask = ~iMask;
        
        iResult = iNo & iMask;
        return iResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0, iRet = 0, iLocation = 0;

        System.out.println("Enter the number : ");
        iValue = sc.nextInt();

        System.out.println("Enter the position : ");
        iLocation = sc.nextInt();

        iRet = OffBit(iValue, iLocation);

        System.out.println("Number after bit OFF : " + iRet);
        
        sc.close();
    }
}