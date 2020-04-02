public class Task258AddDigits {
    /*
    Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.

     */
        public static int addDigits(int num) {
            if(num < 10) return num;

            while(num >= 10) {
                num = sumOfDigits(num);
            }
            return num;
        }

        public static int sumOfDigits(int num){
            int res = 0;
            while(num >= 1) {
                res += num % 10;
                num = num /10;
            }
            return res;
        }

}
