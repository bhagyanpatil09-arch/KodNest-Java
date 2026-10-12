import java.util.Objects;

public class Students {
	int roll;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		Student1 s = (Student1)obj;
		if(this.roll == s.roll && this.name.equals(s.name)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(roll, name);
	}
	Students(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return roll + " " + name;
	}
	void display() {
		System.out.println(roll);
		System.out.println(name);
	}
}


