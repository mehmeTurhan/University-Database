/**
 * This class extends the class class and adds a graduation year and a class year
 * to the student
 *
 * @author Mehmet Turhan
 *
 * @version 1.0 2/25/2021
 */
public class Student extends Person{

  /**
   * enum for the ClassYear
   */
  public enum ClassYear{
      FRESHMAN, SOPHOMORE, JUNIOR, SERNIOR
  }

  private int GraduationYear; //Graduation Year for the student
  ClassYear classYear; //the grade of the student(ex:FRESHMAN, SOPHOMORE, JUNIOR, SERNIOR)

  //Constructors:

   /**
    * Constructs a new student with a name, class Year, and a Graduation Year
    *
    * @param name ,name for the person accesed from the superclass
    * @param GraduationYear , Graduation Year for the student
    * @param classYear the grade of the student(ex:FRESHMAN, SOPHOMORE, JUNIOR, SERNIOR)
    */
  public Student(String name, ClassYear classYear, int GraduationYear){

    super(name);
    this.GraduationYear = GraduationYear;
    this.classYear = classYear;

  }

  /**
   * Changes the ClassYear
   *
   * @param newclassYear new ClassYear for the student
   */
  public void setClassYear(ClassYear newclassYear){
    this.classYear = newclassYear;
  }

  /**
   * @return returns the classYear
   */
  public ClassYear getClassYear(){
    return classYear;
  }

  /**
   * Changes the GraduationYear
   *
   * @param newGraduationYear  new GraduationYear for the student
   */
  public void setGraduationYear(int newGraduationYear){
    this.GraduationYear = newGraduationYear;
  }

  /**
   * @return returns the GraduationYear
   */
  public int getGraduationYear(){
    return GraduationYear;
  }

  /**
   * @return returning the string with the information
   */
  public String toString() {
    return "Student: " + name + ", " + classYear + ", " + GraduationYear;
  }
}
