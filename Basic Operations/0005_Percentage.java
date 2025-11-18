
import java.util.Scanner;

class CheckPercentage
{
    int Obt ;
    int Tot;

    public CheckPercentage(int A , int B)
    {
        Obt = A;
        Tot  = B;
    }

    float checkPercentage()
    {
        float iPerc = ((float)Obt / (float)Tot)*100;
 
        return iPerc;
    }
}

class Percentage
{
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iObtained = 0;
        int iTotal = 0;

        System.out.println("Enter Obtained : \n");
        iObtained = Sobj.nextInt();

        System.out.println("Enter iTotal : \n");
        iTotal = Sobj.nextInt();

        CheckPercentage Cobj = new CheckPercentage(iObtained, iTotal);
       float iRet =  Cobj.checkPercentage();

        System.out.println("Percentage are : \t"+iRet);

        
    }
}