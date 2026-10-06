import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if(first.length() != second.length()) {
            System.out.println(false);
            return;
        }
        StringBuilder sb = new StringBuilder(second);

        boolean isAnagram = true;
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            int index = sb.indexOf(String.valueOf(c));
            if(index != -1) {
                sb.deleteCharAt(index);
                } else {
                    isAnagram = false;
                    break;
                }
                System.out.println("Anagram: " + isAnagram);
            }
        }
    }