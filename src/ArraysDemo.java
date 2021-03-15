public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr ={7, 87, 45, 6, 3, 2, 99};
        printArray(arr);
        System.out.println();
        System.out.println(containsNumber(arr,3));
        System.out.println(containsNumber(arr,8));
        calculateSum(arr);
        int[]arr2 = reserve(arr);
        printArray(arr2);

    }
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static boolean containsNumber(int[]numbers, int n){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSum(int [] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { //foreach hätte auch auf funktioniert
            sum = sum + numbers[i];
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    public static int[] reserve(int[] orginal){
        int [] arr2 = new int[orginal.length];
        for (int i = 0; i < orginal.length; i++) {
            int newIndex = orginal.length -1 - i;
            arr2[newIndex] = orginal[i];
        }
        return arr2;
    }
}
