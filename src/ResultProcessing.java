public class ResultProcessing {
public static void main(String[] args) {

    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    Student s4=new Student();
    Student s5=new Student();
    
    s1.setData(111,"AAA",90);
    s2.setData(112, "BBB", 80);
    s3.setData(113, "CCC", 85);
    s4.setData(114, "DDD", 25);
    s5.setData(115, "EEE", 15);
    
    s1.result();
    s2.result();
    s3.result();
    s4.result();
    s5.result();
    
    s1.showOverallResult();
}
}
