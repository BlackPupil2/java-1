package project8;
interface Person{
    void setData(String name,String sex,String birthday);
    void  getData();


}
class Student implements Person {
    String name;
    String sex;
    String birthday;
    String sid;
    String speciality;
    @Override
    public void setData(String name,String sex,String birthday) {
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
    }
    public void setData(String name,String sex,String birthday,String sid,String speciality){
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.sid=sid;
        this.speciality=speciality;
    }
    @Override
    public void getData() {
        System.out.println(this.name+this.sex+this.birthday+this.sid+this.speciality);

    }
}
class Teacher implements Person{
    String name;
    String sex;
    String birthday;
    String sid;
    String speciality;
    @Override
    public void setData(String name, String sex, String birthday) {
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
    }

    public void setData(String name,String sex,String birthday,String sid,String speciality){
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.sid=sid;
        this.speciality=speciality;
    }
    @Override
    public void getData() {
        System.out.println(this.name+this.sex+this.birthday+this.sid+this.speciality);
    }
}
