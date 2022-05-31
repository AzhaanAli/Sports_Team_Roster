import java.util.ArrayList;

public class Team {

    // ----------------------- //
    // Instance variables.

    private final ArrayList<Person> teamMembers;
    private String teamName;
    private Person coach;
    private String conferenceName;


    // ----------------------- //
    // Constructor.

    // Two constructors.
    // One allows the creation of a team object with a preexisting teamMember
    // ArrayList, while the other initializes an empty teamMember ArrayList.
    public Team(String teamName, Person coach, String conferenceName) {

        this.teamMembers = new ArrayList<>();
        this.teamName = teamName;
        this.coach = coach;
        this.conferenceName = conferenceName;


    }
    public Team(String teamName, Person coach, String conferenceName, ArrayList<Person> teamMembers) {

        this.teamMembers = teamMembers;
        this.teamName = teamName;
        this.coach = coach;
        this.conferenceName = conferenceName;

    }


    // ----------------------- //
    // Getters/ Setters.

    public String getTeamName() {
        return this.teamName;
    }
    public void setTeamName(String newTeamName) {
        this.teamName = newTeamName;
    }

    public Person getCoach() {
        return this.coach;
    }
    public void setCoach(Person newCoach) {
        this.coach = newCoach;
    }

    public String getConferenceName() {
        return this.conferenceName;
    }
    public void setConferenceName(String newConferenceName) {
        this.conferenceName = newConferenceName;
    }

    public ArrayList<Person> getPlayers(){
        return this.teamMembers;
    }

    // ----------------------- //
    // Helper methods.

    // Adds a new player to the teamMembers ArrayList.
    public void addPlayer(Person newPlayer){

        this.teamMembers.add(newPlayer);

    }

    // Prints info about the team.
    public void printTeamInfo(){

        // Print out the teams name & conference.
        System.out.println(
                "TEAM NAME:  " + this.teamName + "\n" +
                "CONFERENCE: " + this.conferenceName + "\n"
        );

        // Then print out the teams coach and player information.
        System.out.println("COACH:\n" + this.coach + "\n");
        this.printAllPlayers();

    }
    private void printAllPlayers(){

        for(int i = 1; i <= this.teamMembers.size(); i++)
            System.out.println(
                    "PLAYER " + i + ":\n" +
                    teamMembers.get(i - 1) + "\n"
            );

    }


    // ----------------------- //


}
