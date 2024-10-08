package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    //save data
    public Employee saveData(Employee employee)
    {
        return employeeDaoImpl.saveData(employee);
    }
    //getAllData
    public List<Employee> getAllData()
    {
        return employeeDaoImpl.getAllData();
    }

    public Employee updateData(Employee employee)
    {
        return employeeDaoImpl.updateData(employee);
    }
    public void deleteData(int empId)
    {
        employeeDaoImpl.deleteData(empId);
    }
    public List<Employee> getDataByName(String empFirstName)
    {
        return  employeeDaoImpl.getDataByName(empFirstName);
    }
    public List<Employee> getDataByContactNumber(long empContactNumber)
    {
        return employeeDaoImpl.getDataByContactNumber(empContactNumber);
    }
}
