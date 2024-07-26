import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        while(true) {
            System.out.println("Press q if you want to quit");
            String quit_choice = sc.nextLine();

            if (quit_choice.equalsIgnoreCase("q")){
                break;
            }

            System.out.println("Press 0 to access to teams space,1 to access to students space");
            int space_choice = sc.nextInt();

            if (space_choice == 0) {
                System.out.println("To create new team press 0, to edit existed team press 1");
                int team_option = sc.nextInt();
                if (team_option == 0){
                    System.out.println("Enter the team name");
                    sc.nextLine();
                    String teamName = sc.nextLine();

                    System.out.println("Enter the project title");
                    String projectTitle = sc.nextLine();

                    System.out.println("Enter the team's note");
                    double teamNote = sc.nextDouble();

                    Team team = new Team(teamName, teamNote, projectTitle);

                    teams.add(team);

                    System.out.println("Team created successfully, this is a list of existed teams: \n---------");
                    for (Team existedTeam: teams){
                        System.out.println(existedTeam);
                    }
                    System.out.println("---------");


                } else if (team_option == 1){
                    continue;
                }
            } else if (space_choice == 1) {
                continue;
            }
        }
    }
}