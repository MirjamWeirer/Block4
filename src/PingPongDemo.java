public class PingPongDemo {
    public static void main(String[] args) {
        //Zahlen von 1 - 100; Überprüfen ob Zahl durch 2 teilbar => ping; Zahl teilbar durch pong; Zahl teilbar durch 6 => ping pong, sonst -
        for (int i = 1; i <=100 ; i++) {
            if (i % 6 == 0){
                System.out.println(i + " ping pong");
            }else if (i % 2 == 0){
                System.out.println(i + " ping");
            }else if (i % 3 == 0){
                System.out.println(i + " pong");
            }else {
                System.out.println(i + " -");
            }
        }
    }
}
