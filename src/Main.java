public class Main {
    public static void main(String[] args) {


        
        /*
         0   1   2   3
   0     1   2   3   4
   1     8   7   6   5
   2     9   10  11  12
   3     16  15  14  13
         */
        int[][] x = new int[4][4];
        int counter=1;
        for(int i=0; i<4; i++) {
            if (i % 2 == 0) {
                // 0 2
                for (int j = 0; j < 4; j++) {
                    x[i][j] = counter++;
                }
            } else {
                // 1 3
                for (int j = 3; j >= 0; j--) {
                    x[i][j] = counter++;
                }
            }
        }
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.printf("%3d",x[i][j]);
            }
            System.out.println();
        }



    }
}