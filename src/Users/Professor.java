package Users;

public class Professor extends Person {
    private int pId;
    private String subject;
    private static int count = 1;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Professor(String fname, String lname, String subject) {
        super(fname, lname);
        this.pId = count++;
        this.subject = subject;
        this.count = count;
    }

    @Override
    public String toString() {
        return pId +" " +super.toString()+ ", "+subject;
    }
}
