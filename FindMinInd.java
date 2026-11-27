public class FindMinInd {
    public static void main(String[] args) {
        int val[] = {12, 33, 1, 0, 153, 89, 456};
        int min = val[0];
        int index = 0;
        for (int i = 0; i < val.length; i++) {
            if (min > val[i]) {
                min = val[i];
                index = i;
            }
        }
        System.out.println("Minimal: " + min);
        System.out.println("Index of minimal: " + index);
    }
}
