package Project5;

public abstract class Person {
    String name;
    char sex;
    int age;

    public Person() {
    }

    public abstract void setData(String name, char sex, int age);

    public abstract String getDetail();
}
