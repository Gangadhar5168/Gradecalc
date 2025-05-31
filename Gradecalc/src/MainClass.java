package Arrays_Learning.Gradecalc;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Student name : ");
        String sname = sc.nextLine();
        System.out.print("How many subjects? ");
        int subCount = sc.nextInt();
        System.out.println("Please enter "+subCount+" subjects marks");
        int[] marks = new int[subCount];
        for (int i=0;i<subCount;i++){
            marks[i] = sc.nextInt();
        }
        sc.close();
        Student student = new Student(sname,marks);
        student.displayResults();
    }

    
}
