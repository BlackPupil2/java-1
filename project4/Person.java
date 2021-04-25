package project4;

import java.util.ArrayList;

public class Person {
    int  age;
    String name;
    char sex;

   // ArrayList<String> List=new ArrayList<>();

    public Person() {
    }

    public Person(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void setData(String name1,char sex1,int  age1){
        this.name=name1;
        this.sex=sex1;
        this.age=age1;

    }
    public String getData(){


        String s5="名字："+this.name+"年龄："+this.age+"性别:"+this.sex;
        return s5;

    }
}
