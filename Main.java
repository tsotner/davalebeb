public class Main {
    public static void main(String[] arg) {
        int num = 90;
        if (num > 100 / 6 * 5) {
            System.out.println("A");
        } else if (num > 100 / 6 * 4) {
            System.out.println("B");
        } else if (num > 100 / 6 * 3) {
            System.out.println("C");
        } else if (num > 100 / 6 * 2) {
            System.out.println("D");
        } else if (num > 100 / 6 * 1) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}