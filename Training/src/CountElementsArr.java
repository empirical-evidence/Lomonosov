public class CountElementsArr {
    public static void main (String[] args) {
        String[] drugs = {"cocaine", "methamphetamine", "marijuana", "heroin"};
        int count = getArrayLength (drugs);
        System.out.println("Количество: "+count);
    }
    public static int getArrayLength(String[] arr){
        return arr.length;
    }
}
