public class CurrencyExchangeDemo {
    public static void main(String[] args) {
        System.out.println("exchangeCurrency(\"HUF\",12) = " + exchangeCurrency("HUF",12));
        System.out.println("exchangeCurrency(\"SEK\",100) = " + exchangeCurrency("SEK",100));
        System.out.println("exchangeCurrency(\"USD\",5) = " + exchangeCurrency("USD",5));
        System.out.println("exchangeCurrency(\"CAD\",200) = " + exchangeCurrency("CAD",200));

    }
    public static double exchangeCurrency(String currencyID, double value){
        double result = 0;
            if (currencyID.equals("HUF")){
                result = value * 328.61;
            }
            if (currencyID.equals("SEK")){
                result = value * 10.76;
            }
             if (currencyID.equals("USD")){
                result = value * 1.12;
            }
            if (currencyID.equals("CAD")){
                result = value * 1.47;
            } 
        return result;
    }
}
