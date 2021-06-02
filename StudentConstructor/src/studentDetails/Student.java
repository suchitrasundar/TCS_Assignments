package studentDetails;

public class Student {
	
	private long rollNo;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getMark4() {
		return mark4;
	}

	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
		 this.rollNo = 0;
         this.name = "";
         this.mark1 = 0;
         this.mark2 = 0;
         this.mark3 = 0;
         this.mark4 = 0;
	}

	public Student(long rollNo, String name, int mark1, int mark2, int mark3, int mark4) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

}
