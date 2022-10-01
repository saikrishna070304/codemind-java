import java.util.Scanner;
class tables
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,o;
        n=sc.nextInt();
        o=sc.nextInt();
        for(int i=1;i<=o;i++)
        {
            if(i%2!=0)
            {
                System.out.println(n+" x "+i+" = "+ n*i);
            }
        }
    }
    
}