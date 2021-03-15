public class RechteckDemo {
    public static void main(String[] args) {
        Rechteck eins = new Rechteck();
        Rechteck zwei = new Rechteck();
        Rechteck drei = new Rechteck();

        eins.length = 4;
        eins.width = 2;
        System.out.println("Rechteck ein:");
        eins.print();

        zwei.length =3.5;
        zwei.width = 2;
        System.out.println("Rechteck zwei:");
        zwei.print();

        drei.length = 5;
        drei.width = 3.5;
        System.out.println("Rechteck drei:");
        drei.print();
    }
}
