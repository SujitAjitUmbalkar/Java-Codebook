import java.util.Scanner;

class CheckPercentage
{
    private float obtained;
    private float total;

    public CheckPercentage(float obtained, float total)
    {
        this.obtained = obtained;
        this.total = total;
    }

    public float calculate()
    {
        return (obtained / total) * 100;
    }
}

class Percentage
{
    public static void main(String[] args)
    {
        Scanner Sobj = new Scanner(System.in);
        float obtained = 0.0f;
        float total = 0.0f;

        while (true)
        {
            System.out.print("Enter Obtained Marks: ");
            obtained = Sobj.nextFloat();

            if(obtained >= 0)
            {
                break;
            }
            System.out.println("Invalid Marks, Obtained shouldn't be less than 0  , Enter Again ! ");
        }

        while (true)
        {
            System.out.print("Enter Total Marks: ");
            total = Sobj.nextFloat();

            if (total > 0 && total >= obtained)
                {break;}

            System.out.println("Invalid! Total must be >= obtained and > 0.");
        }

        CheckPercentage Cobj = new CheckPercentage(obtained, total);
        float percentage = Cobj.calculate();

        System.out.println("\nPercentage: " + percentage + "%");

        Sobj.close();
    }
}
