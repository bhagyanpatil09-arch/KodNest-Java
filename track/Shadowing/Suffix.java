public class Suffix {
    public static void main(String[]  args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int suff[] = new int[n];
        suff[n-1] = arr[n-1];
        for (int i = n-2; i>=0; i--) {
            suff[i] = suff[i+1] + arr[i];
        }
        System.out.println(java.util.Arrays.toString(suff));
    }
    
}
