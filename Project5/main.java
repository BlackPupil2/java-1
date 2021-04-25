package Project5;


import project1.TestPrime;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();
        Student stu5 = new Student();
        Student stu6 = new Student();
        Student[] s1={stu1,stu2,stu3,stu4,stu5,stu6};
        Teacher tea1=new Teacher() ;
        Teacher tea2=new Teacher() ;
        Teacher tea3=new Teacher() ;
        Teacher tea4=new Teacher() ;
        Teacher[] t1={tea1,tea2,tea3,tea4};
        stu1.setData("小明",'1',12,1,'1');
        stu2.setData("小红",'2',12,1,'1');
        stu3.setData("小开",'1',22,1,'1');
        stu4.setData("小网",'2',13,1,'1');
        stu5.setData("小想",'1',15,1,'1');
        stu6.setData("小与",'2',12,1,'1');
        tea1.setData("王老师",'1',22,202001,'1');
        tea2.setData("李老师",'2',22,202001,'1');
        tea3.setData("钱老师",'1',32,202001,'1');
        tea4.setData("新老师",'1',22,202001,'2');

        for (int i = 0; i < 6; i++) {
            System.out.println(s1[i].getDetail());
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(t1[i].getDetail());
        }

    }
}
