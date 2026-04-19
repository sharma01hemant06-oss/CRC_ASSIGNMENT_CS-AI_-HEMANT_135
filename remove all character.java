import java.util.*;
class OnlyAlpha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c))
                res+=c;
        }
        System.out.println(res);
    }
}
