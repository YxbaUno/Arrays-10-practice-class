import java.util.Arrays;
public class Add5 {
    public static void main(String[] args) {
        int val[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(val));
        for (int i = 0; i < val.length; i++) {
            val[i] += 5;
        }
        System.out.println(Arrays.toString(val));
    }
}
