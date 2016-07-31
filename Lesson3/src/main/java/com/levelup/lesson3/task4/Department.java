package com.levelup.lesson3.task4;

/**
 * Created by java on 31.07.2016.
 */
public class Department {
    private String name;
    private Manager departmentManager;
    private Employee[] employees;
    private int countEmployees = 0;

    public Department() {
    }

    public Department(String name, Manager departmentManager, Employee[] employees) {
        this.name = name;
        this.departmentManager = departmentManager;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Manager departmentManager) {
        this.departmentManager = departmentManager;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public boolean addEmployee(Employee employee) {
        //// TODO: 31.07.2016   if(departmentEmployee==employee)
    }

    public boolean removeEmployee(Employee employee) {
        //// TODO: 31.07.2016
    }


}
