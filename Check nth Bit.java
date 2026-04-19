import java.util.*;
class CheckBit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if((n&(1<<k))!=0)
            System.out.println("Set");
        else
            System.out.println("Not Set");
    }
}
