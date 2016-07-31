package com.levelup.lesson3.task4;

/**
 * Created by java on 31.07.2016.
 */
public class Manager extends Employee{

    private Department department;

    public Manager() {
        System.out.println("manager");
    }

    public Manager(String name, String sername, Department department) {
        super(name,sername);
        this.department = department;
        System.out.println("manager");
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName( name);
    }

    public String getSername() {
        return super.getSername();
    }

    public void setSername(String sername) {super.setSername(sername);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", sername='" + getSername() + '\'' +
                ", department=" + department +
                '}';
    }

    public static void main(String[] args) {
        Employee manager = new Manager("Vasya", "Pupkin", null);
    }
}
