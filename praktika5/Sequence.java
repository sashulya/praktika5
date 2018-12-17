public class Sequence {

    public static void rec(int n, int k) {
        System.out.print(k + " ");
        if(n > k)
            rec(n, k+1);
    }

    public static void main(String[] args) {
        rec(10, 1);
    }
}
