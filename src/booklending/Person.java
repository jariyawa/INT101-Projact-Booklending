package booklending;

public class Person {

    private String firstname;
    private String lastname;
    private String idMember;

    public Person(String firstname, String lastname, String idMember) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idMember = idMember;
    }

    public Person() {

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIdMember() {
        return this.idMember;
    }

    public void displayPerson() {
        System.out.println("Name : " + this.firstname + "  " + this.lastname);
        System.out.println("ID Member : " + this.idMember);
    }

}

