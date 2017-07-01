/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_grades;
import java.util.*;
class Student
{
    static int S_no;
    String S_name; 
    String grade;
    double S1, S2, S3, S4, S5, avg;
    
    Student()
    {
        S_no=S_no++;
    }
    void read_details()
    {
        Scanner in = new Scanner(System.in);      
        System.out.print("Enter the Student Name :- ");
        S_name = in.next();
        System.out.print("Enter marks of 5 subjects :-\nSubject 1:- ");
        S1 = in.nextDouble();
        System.out.print("Subject 2 :-");
        S2 = in.nextDouble();
        System.out.print("Subject 3 :-");
        S3 = in.nextDouble();
        System.out.print("Subject 4 :-");
        S4 = in.nextDouble();
        System.out.print("Subject 5 :-");
        S5 = in.nextDouble();
        S_no = S_no;
    }
    void grade()
    {
        avg = (S1+S2+S3+S4+S5)/5;
        if(avg >= 80)
            grade = "A";
        else if(avg >= 60)
            grade = "B";
        else if(avg >= 50)
            grade = "C";
        else
            grade = "Fail";
    }
    void display()
    {
        System.out.println(S_no+"\t"+S_name+"\t\t"+avg+"\t\t"+grade);
    }
    
}
/**
 *
 * @author sherwinjoseph
 */
public class Student_Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int i=0;
        Student stu[] = new Student[100];
        System.out.println("\tWelcome To The Student Grade Calculator");
        String choice;
        do
        {
            stu[i] = new Student();
            stu[i].read_details();
            stu[i].grade();
            System.out.print("Do you want to enter more records (y/n):- ");
            choice = in.next();
            i++;
        }
        while("y".equals(choice) || "Y".equals(choice));      
        int counter= i-1, n=0; 
        System.out.println("S No.\tS Name\t\tAvg Marks\tGrade");      
        while(n<=counter)
        {                 
            stu[n].display();
            n++;
        }        
    }
    
}
