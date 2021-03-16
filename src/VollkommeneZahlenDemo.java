public class VollkommeneZahlenDemo {
    /*
        Vollkommene Zahlen sind die Summe ihrer echten Teiler z.B. 6=1+2+3
        Aufgabe einen Algorithums schreiben, der alle Vollkommenenzahlen bis 100000000 ausfibt
     */
    public static void main(String[] args) {
        calcNumber();
    }
    public static void calcNumber(){
        for (long i = 1; i <= 100000000; i++) {
            int sum = 0;
            for (long j = 1; j < i; j++){
                if (i % j == 0){
                    sum += j;
                }
                if (sum > i){
                    break;
                }
            }
            if (sum == i){
                System.out.println(sum + " Vollkommene Zahl");
            }
        }
    }
}
