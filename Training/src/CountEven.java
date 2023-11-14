public class CountEven {
    public static void main(String[] args){
        int result = countEvenNumbers(new int[] {9,7,4,2,5,3,8,5,12,38});
        System.out.println("Количество четных чисел: " + result);
    }
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
