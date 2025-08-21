package btvn.bai3;

import java.util.ArrayList;

import btvn.bai2.Student;

public class StudentManager implements StudentManagerInterface {
    private ArrayList<Student> students = new ArrayList<>();
    public StudentManager() {}
    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void sortByScoreDesc() {
        for (int i = students.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students.get(j).getScore() < students.get(j + 1).getScore()) {
                    Student tmp = new Student();
                    tmp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, tmp);
                }
            }
        }
    }
    public void sortByScoreAsc() {
        for (int i = students.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students.get(j).getScore() > students.get(j + 1).getScore()) {
                    Student tmp = new Student();
                    tmp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, tmp);
                }
            }
        }
    }
    public Student findByName(String name) {
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.getName())) {
                return student;
            }
        }
        return null;
    }
    public void printStudents() {
        System.out.printf("%-5s | %-20s | %-5s | %-20s | %-10s | %-15s | %-5s | %-5s%n", "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        for (Student student : students) {
            System.out.printf("%-5s | %-20s | %-5d | %-20s | %-10s | %-15s | %-5.2f | %-5s%n", student.getId(), student.getName(), student.getAge(), student.getEmail(), student.getClassName(), student.getAddress(), student.getScore(), student.getGrade());
        }
    }
}
