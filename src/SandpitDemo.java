public class SandpitDemo {
    public static void main(String[] args) {


        double l = 1.4;
        double w = 1.4;
        double h = 0.2;
        String name = "Homemade Sandpit";
        double price = 0;
        System.out.println("Für " + name + "benötigen wir " + calcVolume(l,w,h) + " m³ Sand. Kosten: " + price + " EUR");

        Sandpit homeMade = new Sandpit();
        Sandpit bauhaus = new Sandpit();
        Sandpit whikey = new Sandpit();

        homeMade.heigth = 0.2;
        homeMade.length = 1.4;
        homeMade.width = 1.4;
        homeMade.name = "Selbstgemacht";
        homeMade.price =0;
        System.out.println("homeMade = " + homeMade.calcVolume());
        homeMade.print();

        bauhaus.price = 59;
        bauhaus.length = 1.55;
        bauhaus.width = 1.55;
        bauhaus.heigth = 0.26;
        bauhaus.name = "Sandkasten von Bauhaus";
        System.out.println("bauhaus = " + bauhaus.name);
        bauhaus.print();

        whikey.heigth = 0.3;
        whikey.length = 1.60;
        whikey.width= 1.60;
        whikey.price = 200;
        whikey.name = "Premium von Whikey";
        whikey.print();


    }
    public static double calcVolume(double length, double width, double height){
        return length * width * height;
    }
}
