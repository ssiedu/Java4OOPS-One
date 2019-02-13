public class VADemo {

public static void add(){
    System.out.println("NOTHING TO ADD");
}
public static void add(int a, int b){
    int sum=a+b;
    System.out.println("SUM : "+sum);
            
}
   
public static void add(int...v){
    int sum=0;
    for(int num:v){
        sum=sum+num;
    }
    System.out.println(sum);
}
public static void add(String...v){
    String s="";
    for(String str:v){
        s=s+str;
    }
    System.out.println(s);
}    
public static void main(String args[]){
    add();
    add(5,10);
    add(10,20,30);
    add(10,20,30,40);
    add(1,2,3,4,5,6,7,8,9,10);
    add("ab","cd");
    add("xx","yy","zz");
    
}    
}
/*
    points for using VARARGS
    ---------------------------

1) only one varargs per method.
2) normal parameters can be taken with varargs.
3) varargs must be always on last position.
4) you can overload vararg methods also.
5) 











*/