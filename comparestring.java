import java.util.*;
class StrCompare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("Not Equal");
            return;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }
}
