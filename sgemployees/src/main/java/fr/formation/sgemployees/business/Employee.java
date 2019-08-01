package fr.formation.sgemployees.business;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {

    private long id;

    @Size(max = 10)
    private String identifier;

    @Size(max = 150)
    private String lastName;

    @Size(max = 150)
    private String name;

    @Past
    private LocalDate dateOfBirth;

    @PastOrPresent
    private LocalDate startDate;

    @Positive
    private double salary;

    @Future
    private LocalDate endDate;

    public Employee(String identifier, String lastName, String name,
	    LocalDate dateOfBirth, LocalDate startDate, double salary) {
	this.identifier = identifier;
	this.lastName = lastName;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.startDate = startDate;
	this.salary = salary;
    }

    public Employee(long id, String identifier, String lastName, String name,
	    LocalDate dateOfBirth, LocalDate startDate, double salary) {
	this.id = id;
	this.identifier = identifier;
	this.lastName = lastName;
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.startDate = startDate;
	this.salary = salary;
    }

    public Employee() {
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LocalDate getDateOfBirth() {
	return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate exitDate) {
	this.endDate = exitDate;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", identifier=" + identifier
		+ ", lastName=" + lastName + ", name=" + name + ", dateOfBirth="
		+ dateOfBirth + ", startDate=" + startDate + ", salary="
		+ salary + ", exitDate=" + endDate + "]";
    }
}
