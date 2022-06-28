package com.group.backmangeemp.service;

import com.group.backmangeemp.exception.UserNotFoundException;
import com.group.backmangeemp.model.Employee;
import com.group.backmangeemp.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public Employee addEmp(Employee employee){
        employee.setEmpCode(UUID.randomUUID().toString());
        return empRepo.save(employee);
    }
   public List<Employee> findAllEmployees(){
     return empRepo.findAll();
   }
   public Employee updateEmp(Employee employee){
         return empRepo.save(employee);
   }
   public Employee findEmpById(Long id){
        return empRepo.findEmpById(id)
                      .orElseThrow( ()-> new UserNotFoundException("user by id " + id + "was not found"));
   }
   public void deleteEmp(Long id){
        empRepo.deleteById( id);
   }
}
