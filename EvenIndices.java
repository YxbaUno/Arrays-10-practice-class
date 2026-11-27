public class EvenIndices {
    public static void main(String[] args) {
        int val[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < val.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
