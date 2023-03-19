import java.util.Scanner;

public class Main {

    /*
    * Pascal's Triangle
    * */
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a Number , N : ");

        int n = sn.nextInt();
        pascalTriangle(n);
    }

   /*
   * create a 2d array , int number of columns in each row is equal to the pos of that row
   * make first and last element of that row to 1 and in between elements values are determined by the upper row elements
   * */
    public static void pascalTriangle(int n){

        int[][] arr = new int[n][];

        for(int i=0;i<n;i++){
            arr[i] = new int[i+1];
            arr[i][0] = 1;
            arr[i][i] = 1;

            for(int j=1;j<=i-1;j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        print(arr);
    }

    public static void print(int[][] mat){
        int r = mat.length;
        for(int i=0;i<r;i++){
            int c = mat[i].length;
            for(int k=i;k < r ;k++){
                System.out.print(" ");
            }
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}