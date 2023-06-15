public class Task_02 {
    public static void main(String[] args) {
        correctCode2();
    }

    private static void correctCode2() {
        try {
            int[] intArray = { 2, 3, 4, 5, 6, 7 };
            int d = 0;
            int index = 8;
            if (index >= 0 && index < intArray.length) {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Invalid array index");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}