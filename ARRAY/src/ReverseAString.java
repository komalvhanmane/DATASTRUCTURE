import java.util.LinkedList;

public class ReverseAString {
    public static String reverse(String s){
        StringBuilder ans = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        //Okay lets reverse a string
       /* String s = "Komal";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println("Reversed string is :"+ans);
        String str="kmvm";
        int d=1;
        LinkedList<Character> lst=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            lst.add(str.charAt(i));
        }
        for(int i=0;i<d;i++){
            char temp=lst.get(0);
            lst.remove(0);
            lst.add(temp);
        }
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            s=s.append(lst.get(i));
        }
        System.out.println(s);*/
        String s1="kmvm";
        int d=1;
        String str=reverse(s1);
        //String ans=leftRotate(e);
        LinkedList<Character> lst=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            lst.add(str.charAt(i));
        }
        for(int i=0;i<d;i++){
            char temp=lst.get(0);
            lst.remove(0);
            lst.add(temp);
        }
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            s=s.append(lst.get(i));
        }
        System.out.println(reverse(s.toString()));
    }
}
