public class NarzisstischeZahlenDemo {
    public static void main(String[] args) {
        //Eine Narzisstische Zahl ergibt sich aus der Potenz die gleich der Anzahl ihrer Ziffern ist z.B. 153= 1³ + 5³ +3³
        //alle Narzisstischen Zahl zwischen 1 und 1.000 ausgeben


        for (int exp = 3, exp <= 8; exp++){
            for (int i = 0; i < 30_000_000; i++) {
                if (narzisstischeZahl(i, exp)){
                    System.out.println(i + ", ");
                }
            }
        }
    }
    public static boolean narzisstischeZahl(int number, int exp){
       int sum = 0;
       int originalValue = number;
       while (number > 0){
           int digit = number % 10;
           number = number / 10;
           sum = sum + (int)Math.pow(digit, exp);
       }
       if (sum == originalValue){
           return true;
       }
       return false;
    }
}
