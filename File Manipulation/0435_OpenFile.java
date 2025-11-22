// opening file 
import java.io.*;

class program_0435
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");
        System.out.println("File name is : "+fobj.getName());
        System.out.println("File size is : "+fobj.length());
        System.out.println("File header length is : "+fobj.getName().length());
         
    }
}