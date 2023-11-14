public class MaxValueArr {
    public static void main (String[] args){
        int max = findMaxValue (new int[] {2,99,27,87});
        System.out.println("Max value: "+ max);
    }
    public static int findMaxValue (int[] arr){
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
