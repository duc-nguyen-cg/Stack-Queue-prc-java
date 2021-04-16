import java.util.Stack;

public class Reversal {
    public static int[] reverseArray(int[] array){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }
        return array;
    }

    
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        String newWord = "";
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++){
            newWord += Character.toString(stack.pop());
        }
        return newWord;
    }
}
