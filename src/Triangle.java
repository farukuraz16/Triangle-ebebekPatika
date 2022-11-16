import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.print("Enter a number= ");//ask number
        int num = dat.nextInt();

        for (int i = num; i >= 0; i--) {//forloop for each steps
            for (int j = i; j <= num; j++) {//forloop for space
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {//forloop star
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
