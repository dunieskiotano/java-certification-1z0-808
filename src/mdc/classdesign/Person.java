package mdc.classdesign;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Johnson");
    }

    public Person(String firstName, String last) {
        this.firstName = firstName;
        lastName = last;
    }

    public void setFirstName(String firstName){
        //this();
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String fullName(){
        return firstName + " " + lastName;
        //return firstName + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Dunieski");
        person.setLastName("Otano");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        String fullname = person.fullName();
        System.out.println(fullname);
        System.out.println(person.fullName());

    }
}
