public class IsSimple {

    public static boolean rec(int n, int k) {
        if(n%k != 0 || k < n/2)
            return (n%k == 0) | rec(n, k+1);
        return false;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(!rec(n, 2));
    }
}
