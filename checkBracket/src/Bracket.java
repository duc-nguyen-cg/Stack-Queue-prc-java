import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String str){
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                bStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')'){
                if (bStack.isEmpty()){
                    return false;
                }
                char left = bStack.pop();
                if (left != '('){
                    return false;
                }
            }
        }
        if (bStack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c) ";
        System.out.println(checkBracket(str)); //true

        str = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        System.out.println(checkBracket(str));  //true

        str = "s * (s – a) * (s – b * (s – c) ";
        System.out.println(checkBracket(str));  //false

        str = "s * (s – a) * s – b) * (s – c) ";
        System.out.println(checkBracket(str)); //false

        str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(checkBracket(str)); //true
    }
}
