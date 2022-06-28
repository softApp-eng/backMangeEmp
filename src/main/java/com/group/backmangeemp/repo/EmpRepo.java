package com.group.backmangeemp.repo;

import com.group.backmangeemp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpRepo extends JpaRepository<Employee,Long> {

   Optional<Employee> findEmpById(Long id);
}
