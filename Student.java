public class Student {
	
	private int S_no;
	private String S_name;
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	private double s5;
	private double avg;
	private String grade;

	public String getGrade() {
		return grade;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getS_no() {
		return S_no;
	}

	public void setS_no(int s_no) {
		S_no = s_no;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public double getS4() {
		return s4;
	}

	public void setS4(double s4) {
		this.s4 = s4;
	}

	public double getS5() {
		return s5;
	}

	public void setS5(double s5) {
		this.s5 = s5;
	}
	public static double averageScore(double s1, double s2, double s3, double s4, double s5)
	{
		double sum = s1 + s2 + s3 + s4 + s5;
		return sum/5;
	}
	
	public static String generateGrade(double avg)
	{
		String grade="";
		if(avg >= 80)
            grade = "A";
        else if(avg >= 60)
            grade = "B";
        else if(avg >= 50)
            grade = "C";
        else
            grade = "Fail";
		
		return grade;
	}
	public Student(int S_no, String S_name, double s1, double s2, double s3, double s4, 
			double s5, double avg, String grade) {
		super();
		this.S_no = S_no;
		this.S_name = S_name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.avg = avg;
		this.grade = grade;
	}

	public Student() {
		// TODO Auto-generated constructor stub
    
    
	}

}
