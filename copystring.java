import java.util.*;
class StrCopy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
            t+=s.charAt(i);
        System.out.println(t);
    }
}
