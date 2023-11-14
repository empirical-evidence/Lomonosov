public class Privat1 {
    public static void main (String[] args){
        int result = multiple (3,9,9);
        System.out.println("Ressult: "+result);
    }
    public static int multiple (int a,int b,int c){
        int result = ((a * b) / c) * (c + c);
        return result;
    }
}
