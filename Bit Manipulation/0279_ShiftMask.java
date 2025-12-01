import java.util.Scanner;

class Program0279 {

    public static boolean CheckBit(int iNo, int iPos) {
        int iMask = 1;
        int iResult = 0;

        if(iPos <= 0 || iPos > 32) {
            System.out.println("Invalid bit position");
            return false;
        }

        iMask = iMask << (iPos - 1);
        iResult = iNo & iMask;

        return (iResult == iMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0, iLocation = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        System.out.println("Enter the position : ");
        iLocation = sc.nextInt();

        bRet = CheckBit(iValue, iLocation);

        if(bRet == true) {
            System.out.println("Bit is ON at location " + iLocation);
        } else {
            System.out.println("Bit is OFF at location " + iLocation);
        }
        
        sc.close();
    }
}