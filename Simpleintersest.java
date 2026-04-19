import java.util.*;
class Interest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        float ci=(float)(p*Math.pow((1+r/100),t)-p);
        System.out.println(si);
        System.out.println(ci);
    }
}
