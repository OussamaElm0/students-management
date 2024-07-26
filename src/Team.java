import java.util.ArrayList;

public class Team {
    ArrayList<Student> students = new ArrayList<>();
    String teamName;
    double note;
    String projectTitle;
    int id = 0;

    Team(String teamName, double note, String projectTitle){
        this.teamName = teamName;
        this.note = note;
        this.projectTitle = projectTitle;
        this.id++;
    }

    void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return this.id + "|" + this.teamName + "|" + this.projectTitle + "|" + this.note + "team members:" + this.students.size() ;
    }
}
