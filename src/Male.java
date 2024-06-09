import java.util.Scanner;

public class Male {
    public static void male(){

        System.out.println("Male");
        System.out.print("Type your age \n:");
        Scanner ageInput = new Scanner(System.in);
        int age = ageInput.nextInt();
        System.out.print("Type your Weight (Kg.) \n:");
        Scanner weightInput = new Scanner(System.in);
        int weight = weightInput.nextInt();
        System.out.print("Type your Height (Sm.) \n:");
        Scanner heightInput = new Scanner(System.in);
        int height = heightInput.nextInt();

        //For male:
        // BMR = 66.5 + (13.75 × weight in kg) + (5.003 × height in cm) - (6.75 × age)

        double a = 13.75 * weight;
        double b = 5.003 * height;
        double c = 6.75 * age;

        double result=66.5 + a + b - c;

        System.out.println("Your daily BMR is "+ result + " Calories");

    }

}
