import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int key=sc.nextInt(),l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key){
                System.out.println(mid);
                return;
            }
            else if(a[mid]<key)
                l=mid+1;
            else
                h=mid-1;
        }
        System.out.println("Not Found");
    }
}
