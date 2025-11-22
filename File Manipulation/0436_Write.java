// Note - this program is to show rule of write 

import java.util.*;
import java.io.*;

class program_0436
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to create : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";

                 foobj.write(str);        // error imroved in next program 
                
                 foobj.close();
            }
            else
            {
                System.out.println("File not present in current directory..");
                sobj.close();
                return;
            }

            sobj.close();
            
        }
        catch(IOException iobj)
        {}
        catch(Exception eobj)
        {}
    }
}
