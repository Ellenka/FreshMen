package Storage;

import Users.Student;

import java.util.ArrayList;

public class Group {
    private String number;
    private String faculty;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public Group(String number, String faculty) {
        this.number = number;
        this.faculty = faculty;

    }


}
