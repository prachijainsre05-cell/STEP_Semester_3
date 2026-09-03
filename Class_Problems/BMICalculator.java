public class BMICalculator {

    static String getBmiStatus(double bmi) {

        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        double height = 1.75;
        double weight = 70;

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);
        System.out.println("Status = " + getBmiStatus(bmi));
    }
}