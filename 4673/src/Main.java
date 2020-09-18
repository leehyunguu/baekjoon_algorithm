public class Main {
    public static void main(String[] args) {
        int[] a = new int[10001];
        for (int i = 0; i < a.length; i++) {
            a[method(i+1)] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1) {
                System.out.println(i);
            }
        }
    }

    public static int method(int operand) {
        int a = operand;
        while (operand != 0) {
            a += operand % 10;
            operand /= 10;
        }
        return a > 10000 ? 0 : a;
    }
}
