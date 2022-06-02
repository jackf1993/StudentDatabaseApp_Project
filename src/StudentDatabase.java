import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        List<Student> students = new ArrayList<>();
        for(int i =0; i <numOfStudents; i++){
            students.add(new Student());
            students.get(i).enroll();
            students.get(i).payTuition();
        }
        System.out.println("\nENROLLED STUDENTS:");
        for (Student student : students) {
            System.out.println(student.showInfo());
        }
    }
}
