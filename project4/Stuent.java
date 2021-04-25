package project4;

public class Stuent extends Person {

    int sId;
    int classNo;

    public Stuent() {
    }

    public Stuent(int age, String name, char sex, int sId, int classNo) {
        super(age, name, sex);
        this.sId = sId;
        this.classNo = classNo;
    }


    public void setData(String name,char sex,int age,int sId,int classNo){
      //  this.name=name;
      //  this.age=age;
       // this.sex=sex;
        super.setData(name,sex,age);
        this.classNo=classNo;
        this.sId=sId;
    }
    @Override
    public String  getData(){

    return super.getData()+"班级号:"+this.classNo+"学号："+this.sId;
    }

    public static void main(String[] args) {
        Stuent stu1=new Stuent();
        stu1.setData("11",'男',11,20200101,01);
        System.out.println(stu1.getData());
    }
}
