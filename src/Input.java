import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //Get user age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Get user weight
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        //Get user response
        System.out.print("Are you a smoker? (true or fale): ");
        boolean isSmoker = scanner.nextBoolean();

        //Display all information back to user
        System.out.println("\nMedical Form:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Smoker: " + isSmoker);

        scanner.close();


    }
}
