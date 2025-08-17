package buoi6.hoc;

public class Student extends Person {
    private String school;
    private int studentCode;

    public Student() {}
    public Student(String name, int age, String school, int studentCode) {
        super(name, age);
        this.school = school;
        this.studentCode = studentCode;
    }
    public void graduate(boolean isGraduate) {
        if (isGraduate) {
            System.out.println("Da tot nghiep");
        } else {
            System.out.println("Chua tot nghiep");
        }
    }
    public void eat() {
        System.out.println("I am drinking");
    }

}
