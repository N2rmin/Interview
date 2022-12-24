package org.example.SOLİD.S.Howtodoinjava.Solution;

import org.example.SOLİD.S.Howtodoinjava.Problem.Employee;

public interface IEmployeeStore {
    public Employee getEmployeeById(Long Id);

    public void addEmployee(Employee employee);

}
