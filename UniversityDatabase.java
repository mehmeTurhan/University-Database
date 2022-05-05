/**
 * A simple model for a university 'database'.
 * @author Ewa Syta
 * @author Mehmet Turhan
 *
 * @version 2.0 2/25/2021
 */

public class UniversityDatabase {

    private String name; // University name
    private Person[] people; // An array to store all people at the university
    private int total; // Total number of people at the university

    /**
     * Constructs a new UniversityDatabase provided its name and max size.
     * @param name Specifies the name of the university
     * @param maxSize Specifies the max size of the university
     */
    public UniversityDatabase(String name, int maxSize) {
        people = new Person[maxSize];
        this.name = name;
        total = 0;
    }

    /**
     * Adds a new person to the university database so long the databse is not full.
     * @param p person to add
     */
    public void add(Person p) {
        if (total >= people.length) {
            System.out.println("The database is full.");
        } else {
            people[total] = p;
            total++;
        }
    }

    /**
     * Displays all people in the university database.
     */
    public void display() {
        System.out.println("There are " + total + " people at " + name + ":");
        for (int i = 0; i < total; i++)
            System.out.println((i + 1) + ": " + people[i]);
    }

    public static void main(String args[]) {

        // Add your code below to produce output provided in the lab handout.
        // Create a new university database
        UniversityDatabase Uni = new UniversityDatabase("Trinity College", 10);

        // Create three different types of people
        Student student = new Student("John Smith", Student.ClassYear.FRESHMAN, 2018);
        Staff staff = new Staff("Mary Clarks",Staff.Position.MANAGER,60000);
        Faculty faculty = new Faculty("Bob Johnson",Faculty.Rank.PROFESSOR,80000);

        // Add each to the university database
        Uni.add(student);
        Uni.add(staff);
        Uni.add(faculty);

        // Display the university database
        Uni.display();

    }

}
