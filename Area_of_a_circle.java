import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int r;
        double area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(3.14*r*r);
        System.out.format("%.2f",area);
    }
}