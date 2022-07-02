package basic.java.unit04.lesson26;

import java.util.Arrays;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
