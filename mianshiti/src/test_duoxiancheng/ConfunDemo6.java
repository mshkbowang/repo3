package test_duoxiancheng;



public class ConfunDemo6 {
	public static void main(String[] args) {
		Pupilx pupil=new Pupilx();
		System.out.println(pupil);
	}

}
class Studentx{
	private String name;
	private int height;
	public Studentx() {
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
class Pupilx extends Studentx{
	private int score;

	public Pupilx() {
	
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
		return "Pupilx [score=" 
	+ score +
	", getName()=" 
	+ getName() + 
	", getHeight()="
	+ getHeight()
	+", toString()="
	+ super.toString()
	+ ", getClass()=" 
	+ getClass() 
	+ ", hashCode()=" 
	+ hashCode() + "]";
	}

	
	

	
	
	
}
