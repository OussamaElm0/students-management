import java.util.ArrayList;

public class Team {
    ArrayList<Student> students;
    String teamName;
    double note;
    String projectTitle;

    Team(String teamName, double note, String projectTitle){
        this.teamName = teamName;
        this.note = note;
        this.projectTitle = projectTitle;
    }

    void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return this.teamName + "|" + this.projectTitle + "|" + this.note ;
    }
}
