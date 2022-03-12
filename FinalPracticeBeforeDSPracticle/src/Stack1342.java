public class Stack1342 {
    int maxsize;
    int top;
    int stk[];
    public Stack1342(int maxsize){
        this.maxsize=maxsize;
        top=-1;
        stk=new int[maxsize];
    }

    //isEmpty
    public boolean isEmpty(){
        return top == -1;
    }

    //isfull
    public boolean isfull(){
        return top == maxsize;
    }

    //push
    public void push(int element){
        if(isfull()){
            System.out.println("Stack Overflow");
        }
        else{
            stk[++top]=element;
        }
    }

    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            return stk[top--];
        }
    }

    //display
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stk[i]);
        }
    }

    //eval postfix expression
    public void evalPost(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                push(Character.getNumericValue(s.charAt(i)));
            }
            else{
                char ch=s.charAt(i);
                switch (ch){
                    case '+':{
                        int a=pop();
                        int b=pop();
                        int sum=a+b;
                        push(sum);
                        break;
                    }
                    case '-':{
                        int a=pop();
                        int b=pop();
                        int sub=b-a;
                        push(sub);
                        break;
                    }
                    case '*':{
                        int a=pop();
                        int b=pop();
                        int mul=a*b;
                        push(mul);
                        break;
                    }
                    case '/': {
                        int a=pop();
                        int b=pop();
                        int div=b/a;
                        push(div);
                        break;
                    }
                    default:
                        System.out.println("Invalid operator");
                }
            }
        }
        System.out.println("Evaluated expression :: "+pop());
    }

    public static void main(String[] args) {
        Stack1342 s=new Stack1342(40);
        s.evalPost("34+5*4/");
    }
}
