import java.util.Scanner;
import java.util.Arrays;
public class CountInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int val[] = new int[7];
        for (int i = 0; i < val.length; i++) {
            System.out.print("Enter: [" + i + "]: ");
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] >= 10 && val[i] <= 20) {
                count++;
            }
        }
        System.out.println(Arrays.toString(val));
        System.out.print("Values from 10 to 20: " + count);
    }
}
