public class Plus {
    public static void main(String[] args) {
        int result = calculateSum(5,10);
        System.out.println("Сумма равна: "+result);
    }

    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
}