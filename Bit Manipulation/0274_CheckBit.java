import java.util.Scanner;

class Program0274 {

    // Using int to represent UINT logic
    public static boolean CheckBit(int iNo) 
    {
        int iMask = 8;
        int iResult = 0;

        iResult = iNo & iMask;

        return (iResult == iMask);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        // Note: If input > 2147483647, Java Scanner will throw exception for nextInt().
        // For standard testing of bits, standard integer range is sufficient.

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        bRet = CheckBit(iValue);

        if(bRet == true) 
        {
            System.out.println("4th bit is ON");
        } else {
            System.out.println("4th bit is OFF");
        }
        
        sc.close();
    }
}