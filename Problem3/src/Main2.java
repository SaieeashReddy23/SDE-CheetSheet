public class Main2 {

    public static void main(String[] args){
        int[] arr = {7,6,4,3,1};

        System.out.println(maxProfit(arr));
    }

    public static  int maxProfit(int[] arr){
        int l = arr.length;

        int maxPro = Integer.MIN_VALUE;

        int minValInArr = Integer.MAX_VALUE;

        for(int i=0;i<l;i++){
            if(arr[i] < minValInArr){
                minValInArr = arr[i];
            }

            if(arr[i] - minValInArr > maxPro){
                maxPro = arr[i] - minValInArr;
            }
        }
        return maxPro;
    }
}
