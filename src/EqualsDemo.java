public class EqualsDemo {
public static void main(String[] args) {

    Test t1=new Test(10,20);
    Test t2=new Test(10,20);
    Test t3=t1;
    
    boolean b1=(t1==t3);
    boolean b2=t1.isEquals(t3);
    
    
    System.out.println(b1);
    System.out.println(b2);
    
    
    
}
}
