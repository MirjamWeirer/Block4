public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println("calcFaculty(0) = " + calcFaculty(0));
        System.out.println("calcFaculty(3) = " + calcFaculty(3));
        System.out.println("calcFaculty(6) = " + calcFaculty(6));
    }
    public static long calcFaculty(int value){
        int result = 1;
        for (int i = 1; i <= value; i++) {
            if(value == 0){
                result = 1;
            }
            result = result * i;
        }
        return result;
    }
}
