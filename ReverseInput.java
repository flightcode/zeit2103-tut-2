import java.util.Scanner;
import java.util.Stack;

public class ReverseInput {
    public static void main(String[] args) {
        System.out.println("Input desired lines to reverse. Press enter with no input to stop.");
        Stack<String> inputLines = new Stack<>();

        Scanner input = new Scanner(System.in);
        do {
            inputLines.push(input.nextLine());
        } while(inputLines.peek() != "");
        inputLines.pop();
        input.close();

        System.out.println("Outputting...");
        while (!inputLines.empty()) {
            System.out.println(inputLines.pop());
        }
    }
}
