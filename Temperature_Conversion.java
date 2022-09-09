import java.util.Scanner;
class TC
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f,c;
        c=sc.nextFloat();
        f=32+((c*9)/5);
        System.out.format("%.2f",f);
    }    
}