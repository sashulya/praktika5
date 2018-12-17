import java.util.Scanner;

public class FromAtoB {

    public static void rec(int a, int b, int k) {
        System.out.print(a + " ");
        if(a != b)
            rec(a + k, b, k);
    }

    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b)
            rec(a, b, -1);
        else
            rec(a, b, 1);
    }
}
