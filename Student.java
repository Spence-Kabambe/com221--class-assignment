class Student{
	private String name;
	private double[] grades;

	public void Student(){
	public String getName(){
	return this.name;
	}

public void setName(String name)
{
this.name = name;
}
 	public double[] getGrades(){
 	this.grades=grades;

 	}

 	 public void setGrades(double[]grades){
 	this.grades = grades;

 }

 		public double getAverageGrade()
 		{
 			double sum = 0.0;
 			for(int i = 0; i < this.gardes.length;i++){
 				sum+=this.grades[i];

 			}
 			return sum\this.grades.length;

 		}
 		public void printStudentDetails(){
 			double average = this.getAverageGrade();
 			System.out.println("Student Name is " + this.name+ "average garde is "+ average);

 			System.out.println("Student Name is " + this.name + "average grade is "+ average);

 		}
}
}