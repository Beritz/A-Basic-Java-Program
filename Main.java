import java.util.*;
import java.util.Scanner;

public class Main {
	
	Vector <Student> students = new Vector <Student>();
	Scanner in = new Scanner(System.in);
	
	
	public void display()
	{
		System.out.println("S No.\tS Name\t\tAvg Marks\tGrade");   
		for (int i=0; i<students.size(); i++) {
			System.out.println(students.get(i).getS_no()+"\t"+students.get(i).getS_name()+"\t"+students.get(i).getAvg()+"\t"+students.get(i).getGrade());
		}
	}
	
	public void read_details(int i)
	{
		Scanner in = new Scanner(System.in); 
		
		
        
        int S_no=i+1;
        
	    String S_name; 
	    String grade = "";
	    double avg=0;
	    double S1, S2, S3, S4, S5;
		     
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
        
        
        Student newstu = new Student(S_no, S_name, S1, S2, S3, S4, S5, avg, grade);
        newstu.setS_no(S_no);
        newstu.setS_name(S_name);
        newstu.setS1(S1);
        newstu.setS2(S2);
        newstu.setS3(S3);
        newstu.setS4(S4);
        newstu.setS5(S5);
        
        avg=Student.averageScore(S1, S2, S3, S4, S5);
        newstu.setAvg(avg);
        grade=Student.generateGrade(avg);
        newstu.setGrade(grade);
        students.add(newstu);
        
        
	}

	public Main() {
		// TODO Auto-generated constructor stub
		
		int i=0;
		System.out.println("\tWelcome To The Student Grade Calculator");
        String choice;
        
        do
        {
            read_details(i);
            System.out.print("Do you want to enter more records (y/n):- ");
            choice = in.next();
            i++;
        }
        while("y".equals(choice) || "Y".equals(choice));
        display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
