import java.util.*;
class TemperatureConvert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println(f);
        float c2=(f-32)*5/9;
        System.out.println(c2);
    }
}

