package lab07;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=0;i<=10000;i++)
            System.out.println(i%3 + i%5 == 0 ? "fizzbuzz" : i%3 == 0 ? "fizz" : i%5 == 0 ? "buzz" :  "");
    }
}
