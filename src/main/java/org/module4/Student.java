package org.module4;

public class Student {
    private String name;
    private String familyName;
    private Integer age;

    public Student(String name, String familyName, Integer age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +

                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }
}
