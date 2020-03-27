package problem3.Student;

public class student {
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
