package Project5;

public  class Student extends Person{

    int sId;
    char speciality;
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public char getSpeciality() {
        return speciality;
    }

    public void setSpeciality(char speciality) {
        this.speciality = speciality;
    }




    @Override
    public void setData(String name, char sex, int age) {
        this.name=name;
        this.sex=sex;
        this.age=age;

    }


    @Override
    public String getDetail() {
        return this.name+this.sex+this.age+this.sId+this.speciality;
    }
}
