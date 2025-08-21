package btvn.bai3;

import btvn.bai2.Student;

public interface StudentManagerInterface {
    public void sortByScoreDesc();
    public void sortByScoreAsc();
    public Student findByName(String name);
    public void printStudents();
}
