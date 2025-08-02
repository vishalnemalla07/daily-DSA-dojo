package ARRAYS;

public class reverse_Integer {

    public static int reverse(int num){
        int revNum = 0;

        while(num != 0){
            int last_digit = num % 10;
            num /= 10;

            if(revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && last_digit > 7)) return 0;
            if(revNum < Integer.MIN_VALUE / 10 ||(revNum == Integer.MIN_VALUE / 10 && last_digit < -8)) return 0;

            revNum = (revNum * 10) + last_digit;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num = -123;
        System.out.println("Reverse Integer : " + reverse(num));
    }
}
