public class TamagochiDemo {
    public static void main(String[] args) {
        Tamagochi test = new Tamagochi();
        test.xKoordinate = 6;
        test.yKoordinate = 4;
        test.futterstand = 5;

        System.out.println("x: "+test.xKoordinate + "; "+ test.yKoordinate + "; Futtestand: " + test.futterstand);
        test.move("links", 6);
        System.out.println("x: "+test.xKoordinate + "; "+ test.yKoordinate + "; Futtestand: " + test.futterstand);
        test.fuettern(4);
        System.out.println("x: "+test.xKoordinate + "; "+ test.yKoordinate + "; Futtestand: " + test.futterstand);

    }
}
