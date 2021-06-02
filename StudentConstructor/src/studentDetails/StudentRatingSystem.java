package studentDetails;



public class StudentRatingSystem extends Student{

	public StudentRatingSystem() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void generateRating(Student s) {
         System.out.println("Roll No: "+s.getRollNo()+"\t\t  Name:"+s.getName());
         System.out.println("Mark1 : "+s.getMark1()+"\t\tMark2 :"+s.getMark2());
         System.out.println("Mark3 : "+s.getMark3()+"\t\tMark4 :"+s.getMark4());
         System.out.println("Grade : "+findGrade(s));
         }
 
	 public static String findGrade(Student s) {
         int totalMark = s.getMark1() + s.getMark2() + s.getMark3() + s.getMark4();
         
         double average = totalMark/4;
         
         // find the grade
         if (average >= 90) {
                 return "A+";
         }else if (average >= 80) {
                 return "A";
         }else if (average >= 70) {
                 return "B";
         }else if (average >= 60) {
                 return "C";
         }else {
                 return "D";
         }
      }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student = new Student();
         student.setRollNo(10001);
         student.setName("Anoop");
         student.setMark1(78);
         student.setMark2(82);
         student.setMark3(81);
         student.setMark4(85);
         
         generateRating(student);

	}

}
