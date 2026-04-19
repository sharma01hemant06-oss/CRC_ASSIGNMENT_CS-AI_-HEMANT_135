import java.util.*;
class MatrixEqual{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int f=0;
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                b[i][j]=sc.nextInt();
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                if(a[i][j]!=b[i][j])
                    f=1;
        if(f==0)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
