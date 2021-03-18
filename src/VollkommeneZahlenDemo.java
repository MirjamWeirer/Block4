public class VollkommeneZahlenDemo {
    /*
        Vollkommene Zahlen sind die Summe ihrer echten Teiler z.B. 6=1+2+3
        Aufgabe einen Algorithums schreiben, der alle Vollkommenenzahlen bis 100000000 ausgibt
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100_000_000; i++) {
            if (isPerfectNumber(i) == true){
                System.out.println(i + " is a perfect number");
            }
        }
    }
    public static int calcNumber (int number){
      int sum = 0;
        for (int i = 1; i <= number / 2 ; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
      return sum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number == calcNumber(number)){
            return true;
        }
        return false;
    }
}
