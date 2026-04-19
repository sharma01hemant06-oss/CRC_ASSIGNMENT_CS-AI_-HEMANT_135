class StackArray{
    int top=-1;
    int a[]=new int[5];

    void push(int x){
        if(top<4) a[++top]=x;
    }
    void pop(){
        if(top>=0) top--;
    }
    void display(){
        for(int i=top;i>=0;i--)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args){
        StackArray s=new StackArray();
        s.push(1); s.push(2); s.push(3);
        s.pop();
        s.display();
    }
}
