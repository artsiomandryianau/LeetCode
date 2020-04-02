public class Task258AddDigits {
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
