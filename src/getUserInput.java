import java.util.Scanner;

public class getUserInput {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some input: ");
        String userInput=sc.nextLine();
        System.out.println(userInput);

    }
}
