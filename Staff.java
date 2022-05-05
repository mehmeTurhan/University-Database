/**
 * This class extends the employee class and adds a position to the staff member
 *
 * @author Mehmet Turhan
 *
 *@version 1.0 2/25/2021
 */

public class Staff extends Employee{

  /**
   * enum for the position
   */
  public enum Position{
      CLERK, ADMINISTRATOR, MANAGER
  }

  Position position; //position of the staff (ex:CLERK, ADMINISTRATOR, MANAGER)

//Constructors:

 /**
  * Constructs staff member with a name, position and a slary
  *
  * @param name ,name for the person accesed from the superclass
  * @param salary ,salary for the employee accesed from the superclass
  * @param position ,position of the staff (ex:CLERK, ADMINISTRATOR, MANAGER)
  */
  public  Staff(String name, Position position, int salary){
    super(name, salary);
    this.position = position;
  }

  /**
   * Changes the position
   *
   * @param newPosition    new Position for the staff member
   */
  public void setPosition(Position newPosition){
    this.position = newPosition;
  }

 /**
  * @return returns the position
  */
  public Position getPosition(){
    return position;
  }

  /**
   * @return returning the string with the information
   */
  public String toString() {
      return ("Staff: " + name + ", " + position + ", $" + salary);

  }

}
