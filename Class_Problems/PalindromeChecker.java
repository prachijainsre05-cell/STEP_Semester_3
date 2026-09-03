import java.util.*;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String str) {
        int i = 0, j = str.length() - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        if(isPalindromeIterative(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}