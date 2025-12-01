import java.util.Scanner;

class Program0280B {

    public static boolean CheckBit(int iNo) {
        int iMask = 0x1e;
        int iResult = 0;
        iResult = iNo & iMask;

        if(iResult == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        bRet = CheckBit(iValue);

        if(bRet == true) {
            System.out.println("2nd, 3rd, 4th, 5th bit is ON");
        } else {
            System.out.println("2nd, 3rd, 4th, 5th bit is OFF (Note: Original code said ON in else block too, kept output consistent with logic)");

        }
        
        sc.close();
    }
}