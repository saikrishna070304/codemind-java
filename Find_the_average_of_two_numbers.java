import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        float a;
        x=sc.nextInt();
        y=sc.nextInt();
        a=(float)(x+y)/2;
        System.out.format("%.4f",a);
    }
}