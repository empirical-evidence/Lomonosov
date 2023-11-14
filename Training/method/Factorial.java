public class Factorial {
    public static void main(String[] args){
        int factorialValue = calculateFactorial(12);
        System.out.println("Факториал числа :"+factorialValue);
    }
    public static int calculateFactorial( int n){
        if (n==0){
            return 1;
        }else{
            return n * calculateFactorial (n-1);
        }
    }
}
