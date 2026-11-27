import java.util.Arrays;
public class Temperature {
    public static void main(String[] args) {
        int temp[] = {22, 13, 28, 19, 25, 27, 23};
        int avTemp = 0;
        int days = 0;
        for (int i = 0; i < temp.length; i++) {
            avTemp += temp[i];
        }
        avTemp /= temp.length;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > avTemp) {
                days++;
            }
        }
        System.out.println(Arrays.toString(temp));
        System.out.println("Average temperature: " + avTemp);
        System.out.println("Days above average temperature: " + days);
    }
}
