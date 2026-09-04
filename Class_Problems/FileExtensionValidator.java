import java.util.Scanner;

public class FileExtensionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = sc.nextLine();

        int index = file.lastIndexOf('.');

        if(index == -1) {
            System.out.println("Rejected - invalid file type");
            return;
        }

        String ext = file.substring(index + 1);

        if(ext.equalsIgnoreCase("pdf")
                || ext.equalsIgnoreCase("docx")
                || ext.equalsIgnoreCase("zip")) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected - invalid file type");
        }
    }
}