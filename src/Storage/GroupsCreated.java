package Storage;

import Users.Professor;
import Users.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class GroupsCreated {
       Group B01 = new Group("B01", "Biology");

    ArrayList<Student> B01group = new ArrayList<>();
    public ArrayList<Student> create1() {
        System.out.println(B01.getNumber()+": "+B01.getFaculty());

        B01group.add(new Student("Joe", "Walsh", 18, 3.5, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Brenda", "Stone", 17, 4.0, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Marina", "Oslo", 20, 4.8, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Andrew", "Windsor", 25, 4.2, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Chris", "Ronin", 34, 3.5, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Tom", "Sawer", 17, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Eric", "Awuach", 19, 4.9, (int) (Math.random() * 10), (Math.random() < 0.5)));
        B01group.add(new Student("Jama", "McDonald", 18, 4.1, (int) (Math.random() * 10), (Math.random() < 0.5)));
        return B01group;

    }

    Group C02 = new Group("C02", "Chemistry");
    ArrayList<Student> C02group = new ArrayList<>();
    public ArrayList<Student> create2() {
        System.out.println(C02.getNumber()+": "+C02.getFaculty());
        C02group.add(new Student("Ana", "Kusko", 17, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Sara", "Luna", 18, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("David", "Lee", 20, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Diane", "Lockheart", 25, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Alicia", "Florrick", 17, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Secar", "Sari", 18, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Philip", "Mountbatten", 17, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));
        C02group.add(new Student("Ron", "Ladl", 22, 4.7, (int) (Math.random() * 10), (Math.random() < 0.5)));

        return C02group;

    }
    public void addProfessor () {
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(new Professor("Sherlock", "Holmes", "Critical Thinking"));
        professors.add(new Professor("John", "Watson", "Medicine"));
        professors.add(new Professor("Emma", "Hadson", "Housekeeping"));
    }

    public void print(ArrayList<Student> allstudents) {

        for (Student student : allstudents)
            System.out.println(student);
    }

    public void choose (ArrayList<Student> std) {
        Collections.sort(std, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getSolving(), o2.getSolving());
            }
        });
        Collections.reverse(std);

        System.out.println("Your group leader is: " + std.get(0).getLname() + " with a problem-solving rate " + std.get(0).getSolving());
    }
public void check (ArrayList<Student> st) {
        for (int i = 0; i<st.size(); i++) {
            boolean checking = st.get(i).isPresent();
            if (checking ==true)
            System.out.println(st.get(i).getFname()+" "+st.get(i).getLname()+" "+" is present");

        }



        }


    }



