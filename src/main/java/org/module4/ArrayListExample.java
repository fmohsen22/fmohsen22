package org.module4;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("test","testFamilyName",20));
        studentArrayList.add(new Student("test2","testFamilyName2",16));
        studentArrayList.add(new Student("test3","testFamilyName3",17));


        System.out.println(studentArrayList);

        studentArrayList.stream().anyMatch(p->p.getName().equals("test"));



    }
}
