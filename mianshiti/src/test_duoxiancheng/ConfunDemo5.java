package test_duoxiancheng;

import java.util.zip.ZipEntry;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConfunDemo5 {
	public static void main(String[] args) {
		Pupil pupil=new Pupil();
		System.out.println(pupil);
	}

}
class Student{
	public String name;
	public int height;
	public Student() {
		this.name="wang";
		this.height=189;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + "]";
	}
	
}
class Pupil extends Student{
	private int score;

	public Pupil() {
	super();
		score=0;		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Pupil [score=" + score + ", name=" + name + ", height=" + height + "]";
	}

	

	
	
	
}
