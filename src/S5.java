public class S5 {
    public static void main(String[] args) {
        for (int zeile = 0; zeile <=9; zeile++) {
            for (int i = 0; i <= zeile; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        String zeile = "";
        for (int i = 0; i <= 9 ; i++) {
            zeile = zeile + i + " ";
            System.out.println(zeile);
        }
    }

}
