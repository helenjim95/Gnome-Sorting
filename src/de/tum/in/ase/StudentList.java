package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Arrays;

public class StudentList {
    private Student[][] students;

    public void sortStudentList(@NonNull SortAlgorithm sortStrategy) {
        students = sortStrategy.performSort(students);
    }

    public StudentList(@NonNull Student[][] students) {
        this.students = students;
    }

    public Student[][] getStudents() {
        return students;
    }

    public void setStudents(@NonNull Student[][] students) {
        this.students = students;
    }

    public void printStudents() {
        System.out.println(
                Arrays.deepToString(students).replace("[", "").replace("], ", "," + System.lineSeparator()).replace("]",
                        ""));
    }

    public static void main(String[] args) {
//         Uncomment to test your solution
//         var studentsArray = new Student[3][3];
//
//         studentsArray[0][0] = new Student("John", "Doe", 4);
//         studentsArray[0][1] = new Student("Jane", "Doe", 1);
//         studentsArray[0][2] = new Student("Sara", "Conor", 8);
//         studentsArray[1][0] = new Student("John", "Munich", 3);
//         studentsArray[1][1] = new Student("Jane", "Heilbronn", 2);
//         studentsArray[1][2] = new Student("Jasmine", "Yorha", 9);
//         studentsArray[2][0] = new Student("Diana", "Ako", 6);
//         studentsArray[2][1] = new Student("Sam", "Ouo", 5);
//         studentsArray[2][2] = new Student("Emanuel", "Makkah", 7);
//
//         var studentList = new StudentList(studentsArray);
//         System.out.println("Matrix before sorting:");
//         studentList.printStudents();
//
//         studentList.sortStudentList(new GnomeSort());
//
//         System.out.println();
//         System.out.println("Matrix after sorting:");
//         studentList.printStudents();
    }
}
