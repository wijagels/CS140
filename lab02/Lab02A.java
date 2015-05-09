package lab02;
import java.util.Random;
import java.util.Arrays;

public class Lab02A {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] strings = new String[3];
        for(int i=0;i < strings.length;i++)
            strings[i] = randomString(5 + rand.nextInt(4));
        System.out.println(Arrays.toString(strings));
        System.out.print("[");
        for(String s : strings) {
            System.out.print(s + ',');
        }
        System.out.print("]");
    }

    public static String randomString(int length) {
        Random rand = new Random();
        byte[] bytes = new byte[length];
        rand.nextBytes(bytes);
        bytes[0] = (byte)('A' + Math.abs(bytes[0] % 26));
        for(int i = 1; i < length; i++) {
            bytes[i] = (byte)('a' + Math.abs(bytes[i] % 26));
        }
        return new String(bytes);
    }
}
