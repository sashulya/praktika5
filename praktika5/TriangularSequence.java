public class TriangularSequence {

    public static void rec(int n, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(k + " ");
        }
        System.out.println();
        if(n > k)
            rec(n, k+1);
    }

    public static void main(String[] args) {
        rec(10, 1);
    }
}
