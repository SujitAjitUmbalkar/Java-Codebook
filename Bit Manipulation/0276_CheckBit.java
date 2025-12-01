import java.util.Scanner;

class Program0276 {

    public static boolean CheckBit(int iNo) {
        int iMask = 0x800; // Hex: 
        int iResult = 0;

        iResult = iNo & iMask;

        return (iResult == iMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        bRet = CheckBit(iValue);

        if(bRet == true) 
        {
            System.out.println("12th bit is ON");
        } else {
            System.out.println("12th bit is OFF");
        }
        
        sc.close();
    }
}