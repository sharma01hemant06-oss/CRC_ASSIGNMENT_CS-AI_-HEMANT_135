class Hanoi{
    static void solve(int n,char s,char d,char a){
        if(n==1){
            System.out.println(s+"->"+d);
            return;
        }
        solve(n-1,s,a,d);
        System.out.println(s+"->"+d);
        solve(n-1,a,d,s);
    }
    public static void main(String[] args){
        solve(3,'A','C','B');
    }
}
