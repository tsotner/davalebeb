package davaleba_11_14;
import java.util.Scanner;

public class Ok {
    public static void main(String[] arg) {
        //1
        System.out.print("1. ");
        int[] b = new int [12];
        for (int i = 1; i < b.length + 1; i++) {
            b[i - 1] = i*2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        //2
        System.out.println();
        System.out.print("2. ");
        int sum = 0;
        long num = 1;
        double med = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
            num *= b[i];
            med += b[i];
        }
        med /= b.length;
        System.out.print(sum + " " + num  + " " + med);
        //3
        System.out.println();
        System.out.print("3. ");
        int[] b1 = new int [20];
        for (int i = 0; i < b1.length; i++) {
            b1[i] = i + 1;
        }
        int max = b1[0], min = b1[0];
        for (int i = 0; i < b1.length; i++) {
            if (b1[i] > max){
                max = b1[i];
            }
            if (b1[i] < min){
                min = b1[i];
            }
        }
        System.out.print(min + " " + max + "   ");
        for (int i = 0; i < b1.length; i++) {
            System.out.print(b1[i] + " ");
        }
        //4
        System.out.println();
        System.out.print("4. ");
        int[] b2 = new int [15];
        for (int i = 0; i < b2.length; i++) {
            b2[i] = i + 1;
        }
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i] + " ");
        }
        //5
        System.out.println();
        System.out.print("5. ");
        int sum1 = 0;
        long num1 = 1;
        double med1 = 0;
        for (int i = 0; i < b2.length; i++) {
            sum1 += b2[i];
            num1 *= b2[i];
            med1 += b2[i];
        }
        med1 /= b2.length;
        System.out.print(sum1 + " " + num1  + " " + med1);
        //6
        System.out.println();
        System.out.print("6. ");
        int x = 6;
        boolean torf = false;
        for (int i = 0; i < b2.length; i++) {
            if (x == b2[i]) {
                torf = true;
                System.out.println("yes");
                break;
            }
        }
        if (!torf){
            System.out.println("no");
        }
        //7
        System.out.print("7. ");
        double[] a = {1.5, 3.4, 13.4, 12.3, 6.32};
        double[] c = {1.5, 3.4, 13.4, 12.3, 6.32};
        System.out.print("1) ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("2) ");
        for (int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        double[] a1 = new double [a.length + 1];
        double[] c1 = new double [c.length + 1];
        a1[0] = y;
        c1[c.length] = y;
        for (int i=1; i<a.length + 1; i++){
            a1[i] = a[i - 1];
        }
        for (int i=0; i<c.length; i++){
            c1[i] = c[i];
        }
        for (int i=0; i<a1.length; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i=0; i<c1.length; i++){
            System.out.print(c1[i] + " ");
        }
        //8
        System.out.println();
        System.out.print("8. ");
        int [] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int z = 15;
        torf = false;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (i != j && d[i] + d[j] == z && !torf){
                    System.out.print(d[i] + " " + d[j]);
                    torf = true;
                }
            }
        }
        //9
        System.out.println();
        System.out.print("9. ");
        int [] d1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < d1.length; i++) {
            System.out.print(d1[i] + " ");
        }
        System.out.println();
        int m = sc.nextInt();
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] == m) {
                for (int j = i; j < d1.length - 1; j++) {
                    d1[j] = d1[j + 1];
                }
                d1[d1.length - 1] = 0;
            }
        }
        for (int i = 0; i < d1.length - 1; i++) {
            System.out.print(d1[i] + " ");
        }
        //10
        System.out.println();
        System.out.print("10. ");
        int [] d2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        torf = true;
        for (int i = 0; i < d2.length; i++) {
            if (d2[i] != 0 ){
                torf = false;
            }
        }
        System.out.println();
        while (!torf){
            for (int i = 0; i < d2.length; i++) {
                System.out.print(d2[i] + " ");
            }
            System.out.println();
            int n = sc.nextInt();
            for (int i = 0; i < d2.length; i++) {
                if (d2[i] == n ){
                    d2[i] = 0;
                }
            }
            torf = true;
            for (int i = 0; i < d2.length; i++) {
                if (d2[i] != 0 ){
                    torf = false;
                }
            }
        }
    }
}