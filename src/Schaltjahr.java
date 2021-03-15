public class Schaltjahr {
    public static void main(String[] args) {
        isLeapYear(1996);
        isLeapYear(1900);
        isLeapYear(2000);

       int count = 0;
       for (int i = 0; i <=2100 ; i++) {
           if (isLeapYear(i)){
               count++;
           }
        }
        System.out.println("count " +count);
    }
    public static boolean isLeapYear(int year){
        if (year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println(year + " => Schaltjahr");
                return true;
            }
        }else {
            if (year % 4 == 0) {
                System.out.println(year + " => Schaltjahr");
                return true;
            }
        }
        return false;
    }
}
