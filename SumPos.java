public class SumPos {
    public static void main(String[] args) {
        int sumPos = 0;
        int val[] = {23, -512, 542, 42, -235, 113, 45, -534, 342, -10};
        for (int i = 0; i < val.length; i++){
            if (val[i] > 0) {
                sumPos += val[i];
            }
        }
        System.out.print(sumPos);
    }
}
