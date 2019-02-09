public class Demo {

    private int x, y, z;
    
    public Demo(Demo tmp){
        x=tmp.x;
        y=tmp.y;
        z=tmp.z;
    }
    
    public Demo(int p, int q){
        x=p; y=q;
    }
    public Demo(int a, int b, int c){
        //calling two arg constructor
        this(a,b);
        z=c;
    }
    
    public void showData(){
        System.out.println(x+","+y+","+z);    
    }
    
public static void main(String[] args) {
   
    Demo d1=new Demo(10,20,30);
    Demo d2=new Demo(40,50);
    
    Demo d3=new Demo(d2);
    
    d1.showData();
    d2.showData();
    d3.showData();
    
}
    
}
