public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) { // Error: accessing index out of bounds
            array[i] = i * 2;
        }
        for (int num : array) {
            System.out.println(num);
        }
    }
}