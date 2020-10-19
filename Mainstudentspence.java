import java.util.Scanner;

class Main {
	public static void main (Strin []args){
	System.out.println( "welcome to student Manager");
	System.out.println("############################");

	student spence = new Student();
	Scanner input = new Scanner(System.in);

	System.out.println(" Please enter the student Name ");
	String name = input.nextLine();
	spence.setName(name);

	System.out.println("Thank you, now, enter their grades");
	double[] grades;
	grades= new double[3];

	for(int i=0; i<3;i++){
		System.out.println("Grade" +(i+1)+";");
		grades[i] = input.nextDouble();
	}
	spence.setGrades(grades);
	System.out.println("############################");

	spence.printStudentDetails();
}
}