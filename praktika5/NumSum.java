public class NumSum {

    public static int rec(int n) {
        if(n == 0)
            return 0;
        return n%10 + rec(n/10);
    }

    public static void main(String[] args) {
        int n = 237;
        System.out.println(rec(n));
    }
}