import java.util.Scanner;

class Program0268 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        System.out.printf("Number in Decimal format : %d\n", iValue);
        System.out.printf("Number in Octal format : %o\n", iValue);
        System.out.printf("Number in Hexadecimal format : %x\n", iValue);
        
        sc.close();
    }
}
