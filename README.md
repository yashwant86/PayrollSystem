Payroll Management System

This is a simple Payroll Management System written in Java that helps manage employee details and calculate their salaries. The system supports both full-time and part-time employees, with functionality to add, remove, and calculate the total salary of all employees in the payroll. The project demonstrates object-oriented programming principles like abstraction, inheritance, and polymorphism using an abstract Employee class and its concrete subclasses FulltimeEmployee and ParttimeEmployee.

Project Structure

Employee: An abstract class representing a generic employee with common attributes like name and unique ID. The salary calculation is defined abstractly to be implemented by subclasses.

FulltimeEmployee: Extends the Employee class to represent full-time employees with a fixed salary.

ParttimeEmployee: Extends the Employee class to represent part-time employees paid based on an hourly wage and the number of hours worked.

Payroll: Manages the list of employees, allows adding or removing employees, and calculates the total salary expenditure.

Features

Add Employees: Both full-time and part-time employees can be added to the payroll.
Remove Employees: Employees can be removed from the payroll using their unique ID.
Salary Calculation: Each employee's salary is calculated differently based on their type (full-time or part-time).
Total Salary: The total salary of all employees in the payroll is calculated and displayed.
Print Payroll: Displays the list of employees along with their calculated salaries.

Usage

The Main class demonstrates the functionality by:

Creating a payroll instance.
Adding both full-time and part-time employees to the payroll.
Printing the current employee list and total salary.
Removing an employee and showing the updated payroll and salary.

Sample Output
Employee List: 
Employee[Name: Yashwant, Unique ID: 1, Salary: 50000.0] 
Employee[Name: Raj, Unique ID: 2, Salary: 10000.0] 
Total Salary Paid: 60000.0

New Employee List: 
Employee[Name: Yashwant, Unique ID: 1, Salary: 50000.0] 
Total Salary Paid: 50000.0

Requirements: Java 8 or above.

How to Run

Clone the repository.
Compile and run the Main class to see the system in action.
This project serves as a useful starting point for understanding basic payroll systems and the use of OOP concepts like abstraction and inheritance in Java.
