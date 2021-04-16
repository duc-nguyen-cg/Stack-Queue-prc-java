import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String str){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        //copy to a stack and a queue
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
            queue.offer(str.charAt(i));
        }
        //compare stack and queue
        for (int i = 0; i < str.length(); i++){
            if (stack.pop() != queue.poll()){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String testWord = "tacocat";
        System.out.println(Palindrome.isPalindrome(testWord));
    }
}
