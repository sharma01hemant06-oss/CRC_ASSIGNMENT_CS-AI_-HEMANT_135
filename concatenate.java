import java.util.*;
class StrConcat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c="";
        for(int i=0;i<a.length();i++)
            c+=a.charAt(i);
        for(int i=0;i<b.length();i++)
            c+=b.charAt(i);
        System.out.println(c);
    }
}
