public class Tamagochi {
    int xKoordinate;
    int yKoordinate;
    int futterstand;

    public void move (String richtung, int schritte){
        if (richtung.equals("links")){
            xKoordinate = xKoordinate - schritte;
        }else if (richtung.equals("rechts")){
            xKoordinate = xKoordinate + schritte;
        }else if (richtung.equals("oben")){
            yKoordinate = yKoordinate + schritte;
        }else if (richtung.equals("unten")){
            yKoordinate = yKoordinate - schritte;
        }
        futterstand -= schritte;
    }

    public void fuettern(int futter) {
        futterstand += futter;
    }
}
