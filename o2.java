public class o2 {
    // Sum of numbers from 0 to 9
    static int f(int a) {
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            toplam += i;
        }
        return toplam;
    }

    // Recursive sum
    static int r(int c) {
        if (c == 1) {
            return 1;
        }
        return f(c - 1) + c;
    }

    public static void main(String[] args) {
        System.out.println("f(5) = " + f(5));
        System.out.println("r(5) = " + r(5));
    }
}
