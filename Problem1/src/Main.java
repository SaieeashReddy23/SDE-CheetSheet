public class Main {

    //Brute force approach
    /*
    * if an element is zero , then make all the elements in that row and col to -1 which are other than 0;
    * now again traverse through matrix and make -1 to 0;
    * */
    public static void main(String[] args) {
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int m = mat.length;
        int n = mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0 ){
                   changeValues(mat,i,j);
                    print(mat);
                    System.out.println("================================");
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == -1 ){
                   mat[i][j] = 0;
                }
            }
        }

        print(mat);

    }

    public static void changeValues(int[][] mat , int row , int col){
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            if(mat[i][col] != 0){
                mat[i][col] = -1;
            }

        }
        for(int i=0;i<n;i++){
            if(mat[row][i] != 0){
                mat[row][i] = -1;
            }

        }
    }

    public static void print(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}