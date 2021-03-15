public class Rechteck {
    double length;
    double width;

    public double calcFlaeche(){
        return length * width;
    }
    public double calcDiagonale(){
        int result = 0;
        result = (int) ((length * length) + (width * width));
        result = (int) Math.sqrt(result);
        return result;
    }
    public void print(){
        System.out.println("Die Fläche des Rechtecks beträgt: " + calcFlaeche() + " cm²");
        System.out.println("Die Diagonale des Rechtecks beträgt: " + calcDiagonale() + " cm");
    }
}
