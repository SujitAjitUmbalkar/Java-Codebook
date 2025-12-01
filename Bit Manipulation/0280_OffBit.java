import java.util.Scanner;

class Program0280 {

    // This function turns OFF the 7th bit (value 64)
    public static int ChangeBit(int iNo) 
    {
        int iMask = 0xFFFFFFBF; // This is equivalent to ~64
        int iResult = 0;

        iResult = iNo & iMask;

        return iResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        iRet = ChangeBit(iValue);

        System.out.println("Updated number is : " + iRet);
        
        sc.close();
    }
}