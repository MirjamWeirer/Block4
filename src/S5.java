public class S5 {
    public static void main(String[] args) {
        //Zahlen in der Schleife als Dreieck ausgeben
        for (int zeile = 0; zeile <=9; zeile++) {
            for (int i = 0; i <= zeile; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        String zeile = "";
        for (int i = 0; i <= 9 ; i++) {
            zeile = zeile + i + " "; // Zeile ist ein String in der ersten Zeile steht O, beim 2 Durchlauf kommt die 1 dazu
            System.out.println(zeile);
        }
    }

}
