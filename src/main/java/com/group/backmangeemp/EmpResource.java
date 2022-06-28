package com.group.backmangeemp;

import com.group.backmangeemp.model.Employee;
import com.group.backmangeemp.service.EmpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
<<<<<<< HEAD
//@CrossOrigin("*")
=======
@CrossOrigin("*")
>>>>>>> 0ad928c (2)
@RestController
@RequestMapping("/employee")
public class EmpResource {

    private final EmpService empService;


    public EmpResource(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmp(){
        List<Employee> employees = empService.findAllEmployees();
         return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getAllEmp(@PathVariable("id") Long id){
        Employee employee = empService.findEmpById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addNewEmp(@RequestBody Employee employee){
        Employee newEmployee = empService.addEmp(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee){
        Employee newEmployee = empService.updateEmp(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmp(@PathVariable("id") Long id){
        empService.deleteEmp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
