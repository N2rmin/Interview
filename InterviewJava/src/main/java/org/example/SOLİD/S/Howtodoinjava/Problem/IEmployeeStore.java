package org.example.SOLİD.S.Howtodoinjava.bad;

public interface IEmployeeStore {
    public Employee getEmployeeById(Long Id);
    public void addEmployee(Employee employee);
    public void sendEmail(Employee employee,String content);
}


