import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your sex ");
        System.out.print("1)Male   2)Female \n:");
        String choose = scanner.nextLine();

        switch (choose){
            case "1", "1)", "Male", "male":
                Male.male();
                break;



            case "2","2)","female", "Female":
                Female.female();
                break;
            default:

                System.out.println("You typed something wrong");
        }


    }
}
