
public class ReversalTest {
    public static void main(String[] args) {
        int[] testArray = {1,3,5,4,2,7,9};
        String testWord = "tacocataco";

        for (int element: testArray){
            System.out.print(element + "\t");
        }
        System.out.println();
        testArray = Reversal.reverseArray(testArray);
        for (int element: testArray){
            System.out.print(element + "\t");
        }
        System.out.println();

        System.out.println(testWord);
        System.out.println(Reversal.reverseString(testWord));
    }
}
