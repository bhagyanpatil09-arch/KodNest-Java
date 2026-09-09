
public class StringMethod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "Java";
       char arr[] = s1.toCharArray();
       for(int i = 0; i <= arr.length - 1; i++) {
    	   System.out.println(arr[i]);
       }
       String res = new String(arr);
       System.out.println(res);
	}

}