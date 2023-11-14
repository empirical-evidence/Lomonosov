public class CalcArr {
    public static void main (String[] args) {
        int sum = calculateSum(new int[]{1,44,32,31,76});
        System.out.println("Сумма элементов массива: "+sum);
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}