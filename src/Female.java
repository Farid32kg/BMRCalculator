import java.util.Scanner;

public class Female {
    public static void female(){

        System.out.println("Female");
        System.out.print("Type your age \n:");
        Scanner ageInput = new Scanner(System.in);
        int age = ageInput.nextInt();
        System.out.print("Type your Weight (Kg.) \n:");
        Scanner weightInput = new Scanner(System.in);
        int weight = weightInput.nextInt();
        System.out.print("Type your Height (Sm.) \n:");
        Scanner heightInput = new Scanner(System.in);
        int height = heightInput.nextInt();

        //For female:
        // BMR = 655.1 + (9.563 × weight in kg) + (1.850 × height in cm) - (4.676 × age)

        double a = 9.563 * weight;
        double b = 1.850 * height;
        double c = 4.679 * age;

        double result = 655.1 +a+b-c;

        System.out.println("Your daily BMR is " + result+" Calories");

        }



    }

