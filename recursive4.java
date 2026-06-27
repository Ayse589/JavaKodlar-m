public class recursive4 {
    public static int topla(int m, int n) {

        if (m < 1 || n < 1) {
            return -1;
        }

        if (m == 0) {
            return 0;
        }

        return (m * m + n * n) + topla(m - 1, n);
    }

    public static void main(String[] args) {
        System.out.println(topla(2, 4));

    }

}
/*
 * islem(m, n) =
 * (1² + n²) + (2² + n²) + (3² + n²) + ... + (m² + n²)
 */
