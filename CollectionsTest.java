import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class CollectionsTest {
    public static void main(String[] args) {
        Stack<Integer> testStack = new Stack<>();
        Queue<Integer> testQueue = new LinkedList<>();

        System.out.println("Starting test of testStack...");
        testStack.push(56);
        System.out.println(" testStack add 56: " + testStack);
        testStack.push(34);
        System.out.println(" testStack add 34: " + testStack);
        testStack.push(42);
        System.out.println(" testStack add 42: " + testStack);
        testStack.push(12);
        System.out.println(" testStack add 12: " + testStack);
        testStack.pop();
        System.out.println(" testStack remove: " + testStack);
        testStack.push(12);
        System.out.println(" testStack add 12: " + testStack);
        testStack.pop();
        System.out.println(" testStack remove: " + testStack);
        testStack.pop();
        System.out.println(" testStack remove: " + testStack);
        System.out.println("Finished test of testStack...");
    }
}