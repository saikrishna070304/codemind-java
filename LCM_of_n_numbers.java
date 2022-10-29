import java.util.*;
class Lcm_array
{
    public static int lcm(int a,int b)
    {
        int gcd=0,res=0;
        for(int i=a;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        res=(a*b)/gcd;
        return res;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            ans=lcm(ans,arr[i]);
        }
        System.out.print(ans);
    }
}