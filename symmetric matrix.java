import java.util.*;
class Symmetric{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j]=sc.nextInt();
        int f=0;
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                if(a[i][j]!=a[j][i])
                    f=1;
        if(f==0)
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }
}
