import java.util.ArrayList;
import java.util.List;

/*

Starting with a positive integer N, we reorder the digits in any order (including the original order)
such that the leading digit is not zero.

Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 */
public class Task869ReorderedPowerOf2 {

    public boolean reorderedPowerOf2(int N) {

        int lenghtOfNumber = String.valueOf(N).length();
        int[] elements = new int[lenghtOfNumber];
        for(int i = lenghtOfNumber-1; i>= 0; i--){
            elements[i] = N % 10;
            N = N /10;
        }
        List<Integer> listOfPossibilities = new ArrayList<>();
        createArrayOfPossibleNumbers(lenghtOfNumber, elements, listOfPossibilities);

        for(int i = 0; i < listOfPossibilities.size(); i++) {
            if(checkOfPowerOf2(listOfPossibilities.get(i))) return true;
        }

        return false;
    }


    public static void createArrayOfPossibleNumbers(int n, int[] elements, List<Integer> result) {

        if(n == 1) {
            if(elements[0] != 0) {
                String word = "";
                for(int i = 0; i<elements.length; i++){
                    word += elements[i];
                }
                int possibility = Integer.parseInt(word);
                if(!result.contains(possibility))
                    result.add(possibility);
            }
        } else {
            for(int i = 0; i < n-1; i++) {
                createArrayOfPossibleNumbers(n - 1, elements,result);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            createArrayOfPossibleNumbers(n - 1, elements,result);
        }
    }

    public static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }



    public static boolean checkOfPowerOf2(int K){
        int powerOf2 = 1;
        while(powerOf2<=K){
            if(powerOf2 == K) return true;
            powerOf2 = powerOf2 *2;
        }
        return false;
    }
}
