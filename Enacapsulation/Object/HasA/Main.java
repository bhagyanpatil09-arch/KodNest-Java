public class OS {
	OS() {
		System.out.println("OS is installed");
		}
	void CheckOS() {
		System.out.println("OS is still executing");
	}

}
public class Mobile {
	OS o = new OS();
	
	Mobile() {
		System.out.println("Mobile created with OS");
	}

}

public class Main {

	public static void main(String[] args) {
		Mobile m;
		m = new Mobile();
		
		m.o.CheckOS();
	}

}
