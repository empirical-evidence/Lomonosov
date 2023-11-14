public class MaxNumber {
    public static void main(String[] args){
        int maxNumber = findMaxNumber(7,98);
        System.out.println("Максимальное число: "+maxNumber);
    }
    public static int findMaxNumber(int a,int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
}
