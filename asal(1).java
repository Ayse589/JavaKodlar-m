public class asal {
    public static void asalBul(int a, int b) {
        for (int i = a; i <= b; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    sayac++;
            }
            if (sayac == 0 && i > 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        asalBul(6, 88);
    }
}
