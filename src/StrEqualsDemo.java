public class StrEqualsDemo {
public static void main(String[] args) {

    String s1=new String("indore");
    String s2=new String("indore");
    String s3=s2;
    
    boolean b1=(s1==s2);
    boolean b2=s1.equals(s2);
    
    boolean b3=(s2==s3);
    
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    
    
}
}
