public class Student {
    String name;
    int age;
    int id = 0;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id++;
    }

    public String toString() {
        return this.id + "|" +this.name;
    }
}
