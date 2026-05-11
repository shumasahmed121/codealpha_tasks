import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    String name;
    int marks;

    StudentGradeTracker(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    void setStudent(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

    void displayStudent(){
        System.out.println("NAME: " + name);
        System.out.println("MARKS: " + marks);
    }

    int avgMarks(int Totalmarks , int Numberofsubs){
        int avgMarks;
        avgMarks = Totalmarks/Numberofsubs;
        System.out.println("AVERAGE MARKS: " + avgMarks);
        return avgMarks;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF STUDENTS: ");
        int n = sc.nextInt();
        sc.nextLine();


        ArrayList<StudentGradeTracker> students = new ArrayList<>();


        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i=0 ; i<n; i++) {
            System.out.println("ENTER NAME: ");
            String name = sc.nextLine();

            System.out.println("ENTER MARKS: ");
            int marks = sc.nextInt();
            sc.nextLine();

            StudentGradeTracker s = new StudentGradeTracker(name , marks);
            students.add(s);

            total += students.get(i).marks;
            if(students.get(i).marks>highest){
                highest=students.get(i).marks;
            }
            if (students.get(i).marks<lowest){
                lowest=students.get(i).marks;
            }
        }
        double avg = (double) total/students.size();
        System.out.println("AVERAGE: " + avg);
        System.out.println("HIGHEST: " + highest);
        System.out.println("LOWEST: " + lowest);

        for (int i = 0 ; i<students.size() ; i++){
            System.out.println("=================REPORT=================");
            students.get(i).displayStudent();
        }
    }
}
