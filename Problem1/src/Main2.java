public class Main2 {

    /*
    * Better approach
    *
    * We will be taking 2 dummy arrays of rows and cols
    * if an element is 0 , then that row & col is made -1
    * travers and make those -1 to 0
    * */
    public static void main(String[] args){
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int m = mat.length;
        int n = mat[0].length;

        int[] dummyRows = new int[m];
        int[] dummyCols = new int[n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0 ){
                   dummyRows[i] = -1;
                   dummyCols[j] = -1;
                }
            }
        }

        print(mat);


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dummyRows[i] == -1 || dummyCols[j] == -1 ){
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println("=========================");

        print(mat);


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
