public class S4 {
    public static void main(String[] args) {
        //ausgabe von Zahlen zwischen 1 und 100 die durch 3 teilbar sind
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
