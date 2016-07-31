package com.levelup.lesson3.task4;

/**
 * Created by java on 31.07.2016.
 */
public class Employee {
    private String name;
    private String sername;

    public Employee(String name, String sername) {
        System.out.println("employee");
        this.name = name;
        this.sername = sername;
    }

    public Employee() {
        System.out.println("employee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                '}';
    }
}
