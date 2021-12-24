public class Replace_the_0_with_5 {
    public static void main(String[] args) {
        int n=1004;
        int c=0;
        while(n>0){
            int lsd=n%10;
            if(lsd==0){
                lsd=5;
            }
            c=c*10+lsd;
            n=n/10;
        }
        while(c>0){
            int lsd=c%10;
            n=n*10+lsd;
            c=c/10;
        }
        System.out.println(n);
    }
}
