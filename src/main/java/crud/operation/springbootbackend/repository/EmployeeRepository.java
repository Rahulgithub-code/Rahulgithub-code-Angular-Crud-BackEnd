package crud.operation.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.operation.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
