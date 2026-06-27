public class palindrom {
    static boolean isPalindrom(int input) {
        int temp, tersSayi = 0, kalan;
        temp = input;
        
        while (temp != 0) {
            kalan = temp % 10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;
        }
        
        if (input == tersSayi)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("128 palindrom mu?: " + isPalindrom(128));
        System.out.println("121 palindrom mu?: " + isPalindrom(121));
        System.out.println("1221 palindrom mu?: " + isPalindrom(1221));
    }
}
