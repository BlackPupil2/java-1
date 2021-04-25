package Project5;

public class Teacher extends Person  {
    int tId;
    char department;

    public Teacher() {
    }

    @Override
    public void setData(String name, char sex, int age) {

    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public char getDepartment() {
        return department;
    }

    public void setDepartment(char department) {
        this.department = department;
    }


    public void setData(String name, char sex, int age,int tId,char department) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tId = tId;
        this.department = department;
    }

    @Override
    public String getDetail() {
        return this.name + this.sex + this.age + this.tId+this.department;
    }
}
