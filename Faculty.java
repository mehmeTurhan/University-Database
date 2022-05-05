/**
 * This class extends the employee class and adds a Rank to the staff member
 *
 * @author Mehmet Turhan
 *
 *@version 1.0 2/25/2021
 */
public class Faculty extends Employee{

  /**
   * enum for the Rank
   */
  public enum Rank {
    LECTURER, ASSISTANT_PROFESSOR, ASSOCIATE_PROFESSOR,PROFESSOR
  }

  Rank rank; //rank of the staff member(ex:LECTURER, ASSISTANT_PROFESSOR, ASSOCIATE_PROFESSOR,PROFESSOR)

  //Constructors:

   /**
    * Constructs staff member with a name, Rank and a slary
    *
    * @param name ,name for the person accesed from the superclass
    * @param salary ,salary for the employee accesed from the superclass
    * @param rank ,rank of the staff member(ex:LECTURER, ASSISTANT_PROFESSOR,
    * ASSOCIATE_PROFESSOR,PROFESSOR)
    */
  public Faculty(String name, Rank rank, int salary){
    super(name, salary);
    this.rank = rank;
  }

  /**
   * Changes the rank
   *
   * @param newRank    new rank for the staff member
   */
  public void setRank(Rank newRank){
    this.rank = newRank;
  }

  /**
   * @return returns the rank
   */
  public Rank getRank(){
    return rank;
  }

  /**
   * @return returning the string with the information
   */
  public String toString() {
    return "Faculty: " +name+ ", " +rank+ ", $" +salary;
  }
}
