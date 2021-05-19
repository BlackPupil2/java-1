package project8;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setData("小明","男","20001010","22","数学");
        s1.getData();
        Teacher t1=new Teacher();
        t1.setData("王老师","女","19950220","11","语文");
        t1.getData();
    }
}
