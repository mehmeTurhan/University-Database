/**
 * This class is a super class for the classes Faculty, Staff but extends Person
 *
 * @author Mehmet Turhan
 *
 *@version 1.0 2/25/2021
 */
public class Employee extends Person{

  int salary; //salary for the employee

  //Constructors:

   /**
    * Constructs staff member with a name and a slary
    *
    * @param name ,name for the person accesed from the superclass
    * @param salary ,salary for the employee
    */
  public Employee(String name, int salary){
    super(name);
    this.salary = salary;
  }

  /**
   * Changes the salary for the Employee
   *
   * @param newSalary   new salary for the employee
   */
  public void setSalary(int newSalary){
    this.salary = newSalary;
  }

  /**
   *@return returns the salary
   */
  public int getSalary(){
    return salary;
  }
}
