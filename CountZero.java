public class CountZero {
    public static void main(String[] args) {
        int val[][] = {
            {0, 594, 373},
            {47, 735, 36},
            {0, 1, 292}
        };
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                if (val[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
