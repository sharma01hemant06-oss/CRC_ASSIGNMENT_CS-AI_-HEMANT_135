import java.util.*;
class CountAll{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,sp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1) v++;
            else if(Character.isDigit(ch)) d++;
            else if(ch==' ') sp++;
            else c++;
        }
        System.out.println(v+" "+c+" "+d+" "+sp);
    }
}
