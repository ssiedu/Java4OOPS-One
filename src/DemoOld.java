
public class DemoOld {

    private int x, y, z;
    
    public void set(int p, int q){
        x=p; y=q;
    }
    public void set(int a, int b, int c) {
        set(a,b);
        z = c;
    }

    public void showData() {
        System.out.println(x + "," + y + "," + z);
    }

    public static void main(String[] args) {

        DemoOld d1 = new DemoOld();
        DemoOld d2 = new DemoOld();
        d1.set(10, 20, 30);
        d2.set(40,50);
        d1.showData();
        d2.showData();

    }

}
