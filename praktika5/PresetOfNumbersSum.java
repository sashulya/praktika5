public class PresetOfNumbersSum {

    public static void rec(int k, int s, int n) {
        int sum = 0;
        int temp = n;
        for (int i = 0; i < k; i++) {
            sum += temp%10;
            temp /= 10;
        }
        if(sum == s)
            System.out.print(n + " ");
        if(n < k*10 - 1)
            rec(k, s, n+1);
    }

    public static void main(String[] args) {
        int k = 3;
        int s = 10;

        rec(k, s, 10*(k-1));
    }
}
