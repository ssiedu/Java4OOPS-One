public class ThisRefDemo {

private int x, y;

                    // 10     20  (local)
public ThisRefDemo(int x, int y){
    this.x=x; //this.x instance, only x local 
    this.y=y;
}
public void disp(){
    System.out.println(x+","+y);
    System.out.println("________________________");
}
    
    
public static void main(String args[]){
    
    ThisRefDemo ob1=new ThisRefDemo(10, 20);
    ThisRefDemo ob2=new ThisRefDemo(30, 40);
    ob1.disp();
    ob2.disp();
    
    
    
}    
}
