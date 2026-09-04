import java.util.Scanner;

public class MaskedPhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phone = sc.nextLine();

        if(phone.length() != 10) {
            System.out.println("Invalid phone number");
            return;
        }

        for(int i = 0; i < phone.length(); i++) {
            if(!Character.isDigit(phone.charAt(i))) {
                System.out.println("Invalid phone number");
                return;
            }
        }

        String last4 = phone.substring(6);

        System.out.println("XXXXXX-" + last4);
    }
}