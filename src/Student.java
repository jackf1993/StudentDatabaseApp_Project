import java.util.Objects;
import java.util.Scanner;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static final int costOfCourse = 600;
    private static int id = 1000;

    // Constructor to prompt user to enter the name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("Enter student class level\n1 for Freshmen\n2 for Sophomore\n3 for Junior\n4 for Senior");
        this.gradeYear = in.nextInt();

        setStudentId();
    }

    // Generate an ID
    private void setStudentId(){
        id++;
        studentID = gradeYear + ""+ id;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course;
            Scanner in = new Scanner(System.in);
            course = in.nextLine();

            if(!Objects.equals(course, "Q")) {
                courses +=  "\n  " + course;
                tuitionBalance += costOfCourse;
            }
            else{
                break;
            }
        }while(1 !=0);
    }

    // View balance and pay tuition
    public void viewBalance(){
        System.out.println("Your Balance is: " +tuitionBalance);
    }

    //pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for the payment of $"+ payment);
        viewBalance();
    }

    // show Status
    public String showInfo(){
        return "Name: " +firstName +" " +lastName +
                "\nStudent ID: " + studentID +
                "\nGrade Level: " + gradeYear +
                "\nCourses Enrolled: " + courses +
                "\nCourses Balance: " + tuitionBalance;
    }
}
