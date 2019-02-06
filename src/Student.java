public class Student {

    private int rollNumber;
    private String name;
    private int marks;
    private static int totalPass;
    private static int totalFail;

    public void showOverallResult(){
        System.out.println("TOTAL PASSED  : "+totalPass);
        System.out.println("TOTAL FAILED  : "+totalFail);
    }
            
    public void result() {
        System.out.println("Roll Number  : "+rollNumber);
        System.out.println("Student Name : "+name);
        System.out.println("Marks Scored : "+marks);
        if(marks>=33){
            System.out.println("PASSED");
            totalPass++;
        }else{
            System.out.println("FAILED");
            totalFail++;
        }
        System.out.println("_____________________________________");
    }
            
    public void setData (int a, String b, int c) {
        rollNumber=a; 
        name=b;
        marks=c;
    }
    
}
