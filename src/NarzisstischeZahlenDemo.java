public class NarzisstischeZahlenDemo {
    public static void main(String[] args) {
        //Eine Narzisstische Zahl ergibt sich aus der Potenz die gleich der Anzahl ihrer Ziffern ist z.B. 153= 1³ + 5³ +³
        //alle Narzisstischen Zahl zwischen 1 und 1.000 ausgeben
        narzisstischeZahl();
    }
    public static void narzisstischeZahl(){
        int ziffer = 0;
        for (int i = 1; i < 1000; i++) {
            int temp = 1;
            int zahl = 0;

            while (temp !=0){
                ziffer = temp % 10;
                zahl += (ziffer * ziffer * ziffer);
                temp /= 10;
            }

            if (zahl == i){
                System.out.print(zahl + ", ");
            }
        }
    }
}
