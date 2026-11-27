import java.util.Arrays;
public class CopyEven {
    public static void main(String[] args) {
        int val[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int even = 0;
        System.out.println(Arrays.toString(val));
        for (int i = 0; i < val.length; i++) {
            if (val[i] % 2 == 0) {
                even++;
            }
        }
        int j = 0;
        int val2[] = new int[even];
        for (int i = 0; i < val.length; i++) {
                if (val[j] % 2 == 0) {
                    val2[i] = val[j];
                }
                j++;
            }
        System.out.println(Arrays.toString(val2));
    }
}
