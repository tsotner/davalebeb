import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] arg) {
        System.out.println("1.");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(), a = 0;
        for (int i=1; i<=n; i++){
            a += i;
        }
        System.out.println(a/n);
        System.out.println("2.");
        boolean torf = true;
        int n1 = 27;
        int ok = 0;
        for (int i=1; Math.pow(2,i) <= n1; i++){
            ok = i;
        }
        for (int i=ok; n1>0 && i>=0; i--){
            if (n1 - Math.pow(2,i) > 0){
                System.out.print(Math.pow(2,i) + " ");
                n1 -= Math.pow(2,i);
            }
        }
        System.out.println(n1);
        System.out.println("3.");
        for (int i=0; i<=15; i++){
            if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("4.");
        long b = sc.nextLong();
        int res = 0, m = 0;
        while (b > 0) {
            if (b % 10 == 1){
                res += Math.pow(2, m);
            }
            m++;
            b /= 10;
        }
        System.out.println(res);
        System.out.println("5.");
        int n2 = sc.nextInt(), l = 0;
        int tempn2 = n2;
        int k = 0;
        for (int i=1; Math.pow(2,i) <= n2; i++){
            k = i;
        }
        System.out.println(k);

        for (int i=k; n2>0 && i>=0; i--){
            if (n2 - Math.pow(2,i) > 0){
                n2 -= Math.pow(2,i);
                l *= 10;
                l ++;
            } else {
                l *= 10;
            }
        }
        if (tempn2 % 2 == 0){
            l *= 10;
        } else {
            l *= 10;
            l ++;
        }
        System.out.println(l);
        System.out.println("6.");
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        boolean torf1 = false;
        while (!torf1){
            int inp = sc.nextInt();
            if (num == inp) {
                System.out.println("tqven gamoicanit es ricxvi");
                torf1 = true;
            } else if (num > inp){
                System.out.println("meti");
            } else if (num < inp){
                System.out.println("naklebi");
            }
        }
    }
}