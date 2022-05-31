public class Person {

    // ----------------------- //
    // Instance variables.

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int jerseyNumber;


    // ----------------------- //
    // Constructor.

    public Person(String name, String phoneNumber, String birthDate, int jerseyNumber) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.jerseyNumber = jerseyNumber;

    }


    // ----------------------- //
    // Getters/ Setters.

    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }
    public void setBirthDate(String newBirthDate) {
        this.birthDate = newBirthDate;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }
    public void setJerseyNumber(int newJerseyNumber) {
        this.jerseyNumber = newJerseyNumber;
    }


    // ----------------------- //
    // Helper methods.

    // Returns a string representation of a person.
    // This method overrides the built-in .toString() method, therefore allowing the printing of Person objects.
    public String toString(){

        return
                "NAME:   " + this.name + "\n" +
                "PHONE:  " + this.phoneNumber + "\n" +
                "BIRTH:  " + this.birthDate + "\n" +
                "JERSEY: " + this.jerseyNumber;

    }


    // ----------------------- //


}
