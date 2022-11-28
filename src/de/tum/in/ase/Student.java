package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;

    public Student(@NonNull String firstName, @NonNull String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", lastName, firstName, studentId);
    }
}
