public class Schaltjahr {
    public static void main(String[] args) {
        isLeapYear(1996);
        isLeapYear(1900);
        isLeapYear(2000);
       for (int i = 1; i <=2100 ; i++) {
            isLeapYear(i);
        }
    }
    public static void isLeapYear(int year){

        if (year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println(year + " => Schaltjahr");
            }
        }else {
            if (year % 4 == 0) {
                System.out.println(year + " => Schaltjahr");
            }
        }
    }
}
