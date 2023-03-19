import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printPermutations(arr,0);
        print(res);

    }

    public static void printPermutations(int[] arr,int pos){

        if(pos == arr.length){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(arr[i]);
            }
            res.add(l);
            return;
        }

        for(int i = pos; i < arr.length ; i++){
            swap(arr,pos,i);
            printPermutations(arr,pos+1);
            swap(arr,i,pos);
        }


    }

    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(List<List<Integer>>  arr){

        for(List<Integer> list : arr){
            for(int k : list){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}