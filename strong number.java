import java.util.*;
class Strong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0;
        while(n>0){
            int d=n%10,f=1;
            for(int i=1;i<=d;i++)
                f=f*i;
            sum=sum+f;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
}
