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
                    System.out.println("Select the number of team\n---------");
                    for (Team existedTeam: teams){
                        System.out.println(existedTeam);
                    }
                    System.out.println("---------");

                    int team_id = sc.nextInt();

                    Team team = teams.get(team_id - 1);

                    System.out.println("Select student number to add to this team\n---------");
                    for (Student student: students){
                        System.out.println(student);
                    }
                    System.out.println("---------");

                    System.out.println("Enter the id:");
                    int student_id = sc.nextInt();
                    Student student = students.get(student_id - 1);

                    team.addStudent(student);

                }
            } else if (space_choice == 1) {
                System.out.println("Press 0 to create new student");
                int student_option = sc.nextInt();

                if(student_option == 0){
                    System.out.println("Enter the name of student :");
                    sc.nextLine();
                    String studentName = sc.nextLine();

                    System.out.println("Enter the age of student");
                    int studentAge = sc.nextInt();

                    Student student = new Student(studentName, studentAge);
                    students.add(student);

                    System.out.println("Student craeted succcessfully,this is a list of all students\n---------");
                    for (Student existedStudent: students){
                        System.out.println(existedStudent);
                    }
                    System.out.println("---------");

                }
            }
        }
    }
}