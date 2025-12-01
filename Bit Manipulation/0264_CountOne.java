import java.util.Scanner;

class Program0264 {

    public static int CountOne(int iNo) 
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0) 
        {
            iDigit = iNo % 2;
            if(iDigit == 1) {
                iCount++;
            }
            iNo = iNo / 2;
        }
        return iCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        iRet = CountOne(iValue);

        System.out.println("Number of 1 : " + iRet);
        
        sc.close();
    }
}
