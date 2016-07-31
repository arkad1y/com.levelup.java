package com.levelup.lesson3.task4;

import java.util.Arrays;

/**
 * Created by java on 31.07.2016.
 */
public class Company {
    private String bossName;
    private Department[] departments = new Department[10];
    private Manager[] managers = new Manager[10];
    private Employee[] employees = new Employee[30];
    private int countDepartment = 0;
    private int countManagers = 0;


    public Company() {
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getCountDepartment() {
        return countDepartment;
    }

    public void setCountDepartment(int countDepartment) {
        this.countDepartment = countDepartment;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "bossName='" + bossName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", countDepartment=" + countDepartment +
                '}';
    }

    public boolean addDepartment(String name) {
        if (countDepartment < departments.length) {
            Department department = new Department();
            department.setName(name);
            departments[countDepartment++] = department;
            return true;
        }
        return false;
    }

    public boolean addManager(String name, String sername, String departmentName) {
        if (countManagers < managers.length) {
            Manager manager = new Manager();
            manager.setName(name);
            manager.setSername(sername);
            if (!(departmentName == null) && !departmentName.trim().isEmpty()) {
                Department department = findDepartmentByName(name);
                if (department != null) {
                    manager.setDepartment(department);
                }
            }
            managers[countManagers++] = manager;
            return true;
        }
        return false;
    }

    public Department findDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    public boolean addEmployeeToCompany(String name, String sername) {
        //// TODO: 31.07.2016
    }

    public boolean addEmployeeToCompany(String name, String sername, String deprtmentName) {
        //// TODO: 31.07.2016
    }
    
    public boolean removeEmployee(String name, String sername){
        //// TODO: 31.07.2016  
    }
    public boolean removeDepartmentWithoutEmployees(String departmentName){
        //// TODO: 31.07.2016  
    }

    public boolean removeDepartmentWithEmployees(String departmentName){
        //// TODO: 31.07.2016  
    }
    
    public boolean changeEmployeeDepartment(String employeeName, String employeeSername, String fromDepartmentName, String toDepartmentName){
        //// TODO: 31.07.2016
    }





}
