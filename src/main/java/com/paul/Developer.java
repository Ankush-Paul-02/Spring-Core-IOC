package com.paul;

public class Developer {

    private int age;
    private Computer computer;

    public Developer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age assigned...");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code() {
        computer.compile();
        System.out.println("I'm coding...");
    }
}
