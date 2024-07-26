public class Student {
    String name;
    int age;
    int id;
    static int idCount = 1;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = Student.idCount++;
    }

    public String toString() {
        return this.id + "|" +this.name;
    }
}
