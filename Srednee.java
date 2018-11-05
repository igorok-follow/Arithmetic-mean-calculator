import java.util.Arrays;
import java.util.Scanner;

public class Srednee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lenght array: ");
        int a = in.nextInt();
        System.out.println("Enter the numbers: ");
        double result = 0;
        int massiv[] = new int[a];
        for (int i = 0; i < a; i++) {
            massiv[i] = in.nextInt();
            result = result + massiv[i];
        }
//        System.out.println(Arrays.toString(massiv));
        result = result / a;
        System.out.println("Average: " + result);
    }
}