package chap04;

public class DailyQuiz {
    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3}, {4, 5, 6}};
//        int[][] b = new int[3][3];
//        for(int i = 0; i < a.length; i++){
//            for(int j = 0; j < b.length; j++){
//                b[i][j] = a[i][j];
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
//                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
//            }
//        }

//        int[] array = {12,4,7,20,1};
//        int max = 0;
//        for(int i = 0; i < array.length; i++){
//            max += array[i];
//        }
//        int avg = max / array.length;
//        System.out.println(max);
//        System.out.println(avg);

        for(int i = 1; i <= 20 ; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
