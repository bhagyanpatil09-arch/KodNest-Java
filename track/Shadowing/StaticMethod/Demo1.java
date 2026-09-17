class Demo1 {
	static {
		System.out.println("1st static-Block executed");
	}
	static {
		System.out.println("2nd static-Block executed");
	}
	static {
		System.out.println("3rd static-Block executed");
	}
	{
		System.out.println("1st Nonstatic-Block executed");
	}
	{
		System.out.println("2nd Nonstatic-Block executed");
	}
	{
		System.out.println("3rd Nonstatic-Block executed");
	}

}