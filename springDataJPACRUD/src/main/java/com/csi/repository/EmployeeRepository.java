package com.csi.repository;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

   //custom methods
  public List<Employee> findByEmpFirstName(String empFirstName);

  public List<Employee> findByEmpContactNumber(long empContactNumber);
}
