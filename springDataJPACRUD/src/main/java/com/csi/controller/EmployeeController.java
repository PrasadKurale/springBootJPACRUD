package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/saveData")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee)
    {
        log.info("@@@@@@@@@@@@@TRYING TO SAVE DATA OF EMPLOYEE: "+ employee.getEmpFirstName());
        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllData()
    {
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @PutMapping("/updateData/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId,@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));
    }
    @DeleteMapping("/deleteData/{empId}")
    public ResponseEntity<String> deleteData(@PathVariable int empId)
    {
        employeeServiceImpl.deleteData(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }
    @GetMapping("/getDataByName/{empFirstName}")
    public ResponseEntity<List<Employee>> getDataByName(@PathVariable String empFirstName)
    {
        return ResponseEntity.ok(employeeServiceImpl.getDataByName(empFirstName));
    }

    @GetMapping("/getDataByContactNumber/{empContactNumber}")
    public ResponseEntity<List<Employee>> getDataByName(@PathVariable long empContactNumber)
    {
        return ResponseEntity.ok(employeeServiceImpl.getDataByContactNumber(empContactNumber));
    }



}
