import java.util.*;
class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                f=1;
        }
        if(f==0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
