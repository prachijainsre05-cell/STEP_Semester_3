import java.util.Scanner;

public class CSVStudentRecordParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] data = line.split(",");

        if(data.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Name: " + data[0]
                    + " | Roll No: " + data[1]
                    + " | Dept: " + data[2]);
        }
    }
}