import java.util.ArrayList;
import java.util.List;

public class Student {
    long id;
    String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public long getId(){
//        long studentId = 123465789;
//        return id = studentId;
        return this.id;
    }

    public String getName(){
//        String studentName = "Kapena Magallan";
//        return studentName;
        return this.name;
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        if(this.grades.size() == 0){
            return 0;
        }
        double total = 0.00;
        for(int grade: this.grades){
            total += grade;
        }
        return total/grades.size();
    }
}
