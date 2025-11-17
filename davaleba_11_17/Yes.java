package davaleba_11_17;
import java.util.Scanner;

public class Yes{
    public static void main(String[] arg){
        //1
        System.out.print("1. ");
        Scanner sc = new Scanner(System.in);
        int [] d2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean torf = true;
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
        //2
        System.out.println();
        System.out.print("2. ");
        int[] arr = {3, 7, 4, 1, 2, 8, 4};
        int min = arr[0], minInd = 0, max = arr[0], maxInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxInd = i;
            }
            if (arr[i] < min){
                min = arr[i];
                minInd = i;
            }
        }
        System.out.println("iyide: " + minInd + " dgeze, gayide: " + maxInd + " dgeze");
        //3
        System.out.print("3. ");
        boolean torf1 = true;
        int[] arr1 = {3, 7, 4, 1, 4, 7, 3};
        for (int i = 0; i < arr1.length / 2; i++) {
            if (arr1[i] != arr1[arr1.length - i - 1]) {
                torf1 = false;
                break;
            }
        }
        if (torf1){
            System.out.println("aris");
        } else {
            System.out.println("ar aris");
        }
        //4
        System.out.print("4. ");
        int[] arr2 = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int b = sc.nextInt(), size = arr2.length, index = 0;
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] != b){
                arr3[index] = arr2[i];
                index++;
            } else if (arr2[i] == b){
                size--;
            }
        }
        for (int i=0; i < size; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}