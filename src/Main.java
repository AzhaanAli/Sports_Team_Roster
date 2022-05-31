import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    // ----------------------- //
    // Global variables/ objects.

    public static final Scanner scanner = new Scanner(System.in);


    // ----------------------- //
    // Main method.

    public static void main(String[] args) {

        // Sample coach.
        Person obama = new Person(
                "Barak Obama",
                "425-691-9875",
                "August 4, 1961",
                0
        );

        // Create new team with coach and values.
        Team team = new Team(
                "Creative and Funny Team Name",
                obama,
                "Bellevue College"
        );

        // Add a bunch of players to our glorious team.
        team.addPlayer(new Person("james", "911", "april 2nd",  13));
        team.addPlayer(new Person("jemes", "912", "april 3rd",  17));
        team.addPlayer(new Person("jimes", "913", "april 5th",  19));
        team.addPlayer(new Person("jomes", "914", "april 7th",  23));
        team.addPlayer(new Person("jumes", "915", "april 11th", 29));

        // Add a new player with the users input.
        team.addPlayer(promptNewPerson());

        // Print out the team's information.
        System.out.println("\nTeam " + team.getTeamName() + "'s information:");
        team.printTeamInfo();

        // Prompt user to enter a name to search the team for.
        System.out.print("Enter a name to search for: ");
        searchTeamMember(
                team.getPlayers(),
                scanner.nextLine()
        );

        // Close the scanner since we don't need it anymore.
        scanner.close();

    }


    // ----------------------- //
    // Helper methods.

    // Searches for one team member within an array of people by name.
    // This method assumes that every team member's name is unique.
    public static void searchTeamMember(ArrayList<Person> teamMembers, String name) {

        // Loop through every single team member.
        for(Person member : teamMembers)
        {
            // If we encounter just one of them that has the name were looking for,
            // print out his attributes, and stop searching for more matching names.
            if (member.getName().equals(name))
            {
                System.out.println(member);
                return;
            }
        }

        // If we've managed to go through then entire list without finding one person and ending the loop,
        // Then that means that we have not found any matches in the list.
        System.out.println("There are no team members named " + name + " on the team.");

    }

    // Returns a person object created by the users input.
    public static Person promptNewPerson(){

        // Get all fields required to make a person object from the user.
        System.out.print("Enter the name of the new player: ");
        String name = scanner.nextLine();

        System.out.print("Enter " + name + "'s phone number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter " + name + "'s date of birth: ");
        String birthdate = scanner.nextLine();

        System.out.print("Enter " + name + "'s jersey number: ");
        int jerseyNum = Integer.parseInt(scanner.nextLine());

        // Assemble a new person object with the gathered information.
        return new Person(name, phoneNum, birthdate, jerseyNum);

    }


    // ----------------------- //


}