package basic.java.unit04.lesson26;

import basic.java.util.Util;

public class Lesson26 {
    public static void main(String[] args) {
        Util.printTitle("Orientação Objetos - Associação unidirecional (muitos para um)");

        School school = new School("Escola do Chaves");

        Teacher teacher1 = new Teacher("Girafales 1");
        Teacher teacher2 = new Teacher("Girafales 2");
        Teacher teacher3 = new Teacher("Girafales 3");

        Teacher[] teachers = new Teacher[]{teacher1 , teacher2 , teacher3};
        school.setTeachers(teachers);

        System.out.println(school);

    }
}
