package javabuoi4;

public class Student1 {
    //Tinh dong goi
    private String name;
    private int age;
    private String add;
    private float diem;
    private String gender;

    //Contructor co tham so
    public Student1(String name, int age, String add, float diem, String gender) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.diem = diem;
        this.gender = gender;
    }
    //contructor khong co tham so 
    public Student1(){

    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Funtion co the tra ve
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

