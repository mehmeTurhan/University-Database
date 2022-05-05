/**
 * This class is the super class for the classes Employee, Student, Faculty, Staff
 *
 * @author Mehmet Turhan
 *
 *@version 1.0 2/25/2021
 */
public class Person{

  protected String name; //name for the person

  //Constructors:

   /**
    * Constructs a new Person
    *
    * @param name ,name for the person
    */
  public Person (String name){
    this.name=name;
  }

  /**
   * Changes the name
   *
   * @param newName new name for the Person
   */
  public void setName(String newName){
    this.name = newName;
  }

  /**
   * @return returns the name
   */
  public String getName(){
    return name;
  }
}
