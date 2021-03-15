/*
    Klassen sind "Datentypen"
    Klassen, welche als Datentypen gebraucht, sollten keine main-Methoden
    Klassen, haben Attribute /Eigenschaften
 */

public class Sandpit {
    double length;
    double heigth;
    double width;
    String name;
    double price;

    //static is not needed
    public double calcVolume(){
        return length * width * heigth;
    }

    public void print(){
        System.out.println("Für " + name + "benötigen wir " + calcVolume() + " m³ Sand. Kosten: " + price + " EUR");
    }
}
