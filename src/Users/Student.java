package Users;

import Storage.Group;

public class Student extends  Person {
    private int sId;
    private  int age;
    private double GPA;
    private int solving;
    private boolean present;

    private  static int count = 1;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getSolving() {
        return solving;
    }

    public void setSolving(int solving) {
        this.solving = solving;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public Student(String fname, String lname, int age, double GPA, int solving, boolean present) {
        super(fname, lname);
        this.sId = count ++;
        this.age = age;
        this.GPA = GPA;
        this.solving = solving;
        this.present = present;
    }

    @Override
    public String toString() { return
        sId+" "+super.toString()+ ", "+age+ " years old, " + "GPA: "+GPA; }
}
