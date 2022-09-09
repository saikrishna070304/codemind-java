import java.util.Scanner;
class fm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,m,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        m=a*b;
        System.out.format("%.2f",m);
    }
}