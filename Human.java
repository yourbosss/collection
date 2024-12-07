package org.example;

public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) { //инициализация.
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // получение значение извне.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // compare сравнивает возраст.
    //отрицательное значение, если this.age меньше, чем other.age и наоборот.
    @Override
    public int compareTo(Human other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", возраст: " + age;
    }
}
