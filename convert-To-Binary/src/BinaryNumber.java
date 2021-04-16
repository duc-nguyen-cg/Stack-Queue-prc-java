import java.util.Scanner;
import java.util.Stack;

public class BinaryNumber {

    public static int toBinary(int number) {
        int temp = number;
        Stack<Integer> stack = new Stack<>();
        String binNumber = "";

        while (temp != 0) {
            stack.push(temp % 2);
            temp = temp / 2;
        }
        while (!stack.isEmpty()){
            binNumber += stack.pop();
        }

        return Integer.parseInt(binNumber);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int testNumber = scanner.nextInt();
        System.out.print("Binary number is: " + BinaryNumber.toBinary(testNumber));
    }
}
