//class Person {
//    String firstName;
//    String lastName;
//    int yearOfBirth;
//
//     Person(String firstName, String lastName, int yearOfBirth){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.yearOfBirth = yearOfBirth;
//    }
//
//    // the first way to desplay by creating the methods
//    /*
//    public void desplayInfo(){
//        System.out.println("the person name is: " + firstName);
//        System.out.println("the person 's last name is: " + lastName);
//        System.out.println("the person's year's of birth is: " + yearOfBirth);
//
//    }
//
//    public static void main(String[] args){
//        Person person1 = new Person("Ellene", "Ellite", 29);
//        person1.desplayInfo();
//
//    }*/
//
//    // the second way to create single methods to dysplay varebles
//
//    String getFirstName(){
//        // method to return the first name
//        return this.firstName;
//    }
//
//    String getLastName(){
//        // method to return the last name
//        return this.lastName;
//    }
//
//    int getAge(){
//        return this.yearOfBirth;
//    }
//
////    public static void main(String[] arg){
////        Person person = new Person("Masha", "Johsnon", 29);
////
////        person.getFirstName();
////        person.getLastName();
////        person.getAge();
//
//
////    }
//    String getFullName() {
//        return  this.firstName + " " + this.lastName;
//    }
//
//}



/**
 * This class represents a person The person has a first name, last name and an
 * year of birth
 */
public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    /**
     * Constructs a Person object and initializes it 
     * to the given first name, last name and year of birth
     * @param firstName
     * @param lastName
     * @param yearOfBirth
    */
    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
/**
 * Get the first name of this person
 * @return the first name of this person
 */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return 2024 - yearOfBirth; // Assuming age is calculated based on the current year
    }
    /**
     * get the fullname and return the firt and last name
     * @return
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
