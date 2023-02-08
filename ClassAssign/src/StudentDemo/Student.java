package StudentDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {

	private int id;
    private String name;
    private int subMarks[] = new int[3];
    private double percentage;
    private char grade;
    
    public Student(int id, String name, int[] subMarks, double percentage, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.subMarks[0] = subMarks[0];
		this.subMarks[1] = subMarks[1];
		this.subMarks[2] = subMarks[2];
		this.percentage = percentage;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(int[] subMarks) {
		this.subMarks = subMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Student [id= " + getId() + ", name= " + getName() + ", subject Marks= " + Arrays.toString(getSubMarks())
				+ ", Percentage = " + getPercentage() + ", Grade = "
				+ getGrade() + "]";
	}


}
