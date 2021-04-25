package Project5;



public class main {
    public static void main(String[] args) {
        Student stu1= new Student() ;

        stu1.setData("asd",'1',121);
        stu1.setsId(11);
        stu1.setSpeciality('数');

        System.out.println(stu1.getDetail());
    }
}
