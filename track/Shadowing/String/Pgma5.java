public class Pgm5 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		if(s1 == s2) {
			System.out.println("Ref are Equal");;
		} else {
			System.out.println("Ref are not - Equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are NOT same");
		}

	}

}
