package com.levelup.lesson1.test;

/**
 * Created by java on 31.07.2016.
 */
public class Manager extends Employee{



    public Manager() {
        System.out.println("manager");
    }

    public Manager(String name, String sername ) {


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



    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", sername='" + getSername() + '\'' +
                ", department=" +  +
                '}';
    }

    public static void main(String[] args) {
        Employee manager = new Manager("a","b");
        
    }
}
