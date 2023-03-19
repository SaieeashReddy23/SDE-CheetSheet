public class Main {
    public static void main(String[] args) {
       int[][] mat = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

       int[][] res = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        print(mat);
        System.out.println("===================");
        rotate(mat);
        System.out.println("======================");
        print(res);
    }

    public static void rotate(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i > j){
                     int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j<c/2){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][c-j-1];
                    arr[i][c-j-1] = temp;
                }

            }
        }

        print(arr);
    }

    public static void print(int[][] arr){
        int c = arr[0].length;
        for(int[] ints : arr) {
            for (int j = 0; j < c; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}