public class Davaleba {
    public static void main(String[] args) {
        //1
        System.out.println("1.");
        double cel1 = 36, far1;
        far1 = cel1 * 1.8 + 32;
        System.out.println(cel1 + " --> " + far1);
        //2
        System.out.println("2.");
        double far2 = 81, cel2;
        cel2 = (far2 - 32) / 1.8;
        System.out.println(far2 + " --> " + cel2);
        //3
        System.out.println("3.");
        int year1 = 1000, year2 = 1024, year3 = 1200;
        if ((year1 % 400 == 0) || (year1 % 100 != 0 && year1 % 4 == 0)){
            System.out.println(year1 + " nakiania");
        } else {
            System.out.println(year1 + " ar aris nakiani");
        }
        if ((year2 % 400 == 0) || (year2 % 100 != 0 && year2 % 4 == 0)){
            System.out.println(year2 + " nakiania");
        } else {
            System.out.println(year2 + " ar aris nakiani");
        }
        if ((year3 % 400 == 0) || (year3 % 100 != 0 && year3 % 4 == 0)){
            System.out.println(year3 + " nakiania");
        } else {
            System.out.println(year3 + " ar aris nakiani");
        }
        //4
        System.out.println("4.");
        int x = 3, y = -5;
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        }  else if (x > 0 && y < 0) {
            System.out.println(4);
        }
        //5
        System.out.println("5.");
        int num1 = 18, num2 = 6;
        String str = "/";
        if (str == "+") {
            System.out.println(num1 + num2);
        } else if (str == "-") {
            System.out.println(num1 - num2);
        } else if (str == "*") {
            System.out.println(num1 * num2);
        } else if (str == "/") {
            System.out.println(num1 / num2);
        }
    }
}