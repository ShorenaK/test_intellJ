// choncxi , tmeplates king and quinc bulding the stong desinging reusble  castle to ein the war against oopont  for the bottole
// to class is the choncjhi consutrecter is the bulder, bulding the , chess figures and definted the method as he object isadded with methid staing
// what assing its coballity to do win the bottle "' chess game""
// in the bulder -- consturure we deifne the varboles meaning what tolls the bulder will be using to buld
// objects Suchas : tool of string the fisr name and last name tool of int age, then we create what objec can do so we create methds with ht elass.
//
class Person {
    String firstName;
    String lastName;
    int yearOfBirth;

     Person(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    // methods
    public void desplayInfo(){
        System.out.println("the person name is: " + firstName);
        System.out.println("the person 's last name is: " + lastName);
        System.out.println("the person's year's of birth is: " + yearOfBirth);

    }

    public static void main(String[] args){
        Person person1 = new Person("Shorena", "Anzhilov", 49);
        person1.desplayInfo();

    }
}

