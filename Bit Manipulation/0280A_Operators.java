class Program0280A {
    
    public static void main(String[] args) {
        int No1 = 13;
        int No2 = 24;

        int Ans = 0;

        Ans = No1 & No2;
        System.out.println("Bitwise and : " + Ans);

        Ans = No1 | No2;
        System.out.println("Bitwise or : " + Ans);
        
        Ans = No1 ^ No2;
        System.out.println("Bitwise xor : " + Ans);

        Ans =  ~No2;
        System.out.println("Bitwise or of No2 : " + Ans);
    }
}