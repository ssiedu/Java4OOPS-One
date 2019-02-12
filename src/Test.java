public class Test {

    private int x, y;
    
    
    //write a method in Test class to compare two objects
    
    
    public boolean isEquals(Test obj){
        if(x==obj.x && y==obj.y){
            return true;
        }else{
            return false;
        }
    }
            
    
    
    
    
    public void show(){
        System.out.println(x+","+y);
    }
            
    public Test(int a, int b){
        x=a; y=b;
    }
    
    
    
public static void main(String[] args) {
    Test t1;
    new Test(10,20);
    Test t2=new Test(30,40);
    Test t3=t2;
    t1=t3;
    t1.show();
    t2.show();
    t3.show();
    System.out.println("________________________");
    t2.x=15;
    t1.show();
    t2.show();
    t3.show();
    System.out.println("________________________");
    t3=new Test(50,60);
    t1.show();
    t2.show();
    t3.show();
    System.out.println("________________________");
    t2=t3;
    t1.show();
    t2.show();
    t3.show();
    System.out.println("________________________");
    t1=t2;
    t1.show();
    t2.show();
    t3.show();
    System.out.println("________________________");
    
    
    
}
    
}
