public class Timetable {
    public static void main(String[] args) {
        int val[][] = {
            {125, 342, 83},
            {42, 589, 76}
        };
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
    }
}
