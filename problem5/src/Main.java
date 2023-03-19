public class Main {
    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(maxSubArraySum(arr));
    }


    // This is a better solution with O(N2) but with kandanes solution we can do it Linearly.

    public static int maxSubArraySum(int[] arr){

        int l = arr.length;

        if(l == 1){
            return arr[0];
        }

        int[] accArr = new int[l];

        int temp = 0;

        for(int i=0;i<l;i++){
            temp += arr[i];
            accArr[i] = temp;
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int t = accArr[j] - accArr[i];
                if(t > max){
                    max = t;
                }
            }
        }



        print(arr);
        print(accArr);


        return max;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}