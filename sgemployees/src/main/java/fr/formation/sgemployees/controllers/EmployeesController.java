package fr.formation.sgemployees.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.sgemployees.business.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @PostMapping()
    public void create(@RequestBody @Valid Employee employee) {
	System.out.println("Employee created: " + employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
	Employee employee = new Employee("A123456", "Lecerf", "Daria",
		LocalDate.of(1987, 05, 26), LocalDate.of(2019, 06, 11),
		50000.00);
	employee.setId(id);
	return employee;
    }

    @GetMapping()
    // http://localhost:8080/employees?size=20&page=1
    public List<Employee> getEmployees(@RequestParam("size") int size,
	    @RequestParam("page") int page) {
	List<Employee> employeesList = new ArrayList<>();
	Employee employee1 = new Employee(1, "A123456", "Lecerf", "Daria",
		LocalDate.of(1987, 05, 26), LocalDate.of(2019, 06, 11),
		50000.00);
	Employee employee2 = new Employee(1, "A123456", "Berthelot", "Laurent",
		LocalDate.of(1969, 05, 31), LocalDate.of(2019, 06, 11),
		50000.00);
	employeesList.add(employee1);
	employeesList.add(employee2);
	System.out.println("Page: " + page + ", size: " + size);
	return employeesList;
    }

    @PutMapping("/{id}")
    public void modify(@PathVariable("id") Long id) {
	System.out.println("Employee modified, id: " + id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	System.out.println("Employee deleted, id: " + id);
    }

    @PatchMapping("/{id}")
    public void patch(@PathVariable("id") Long id) {
	System.out.println("Employee updated, id: " + id);
    }
    /*
     * { "identifier": "A1012055", "name": "Laurent", "lastName": "Berthelot",
     * "dateOfBirth": "1969-05-31", "startDate": "2018-12-26", "salary":
     * 35000.00, "endDate": null }
     */
}
