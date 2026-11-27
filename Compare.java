public class Compare {
    public static void main(String[] args) {
        int count = 0;
        int val[] = {12, 431, 0, 1, 21, 11, 8, 9};
        for (int i = 1; i < val.length; i++) {
            if (val[0] < val[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
