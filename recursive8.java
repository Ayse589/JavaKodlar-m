public class recursive8 {
    public static boolean palindrom(String kelime) {
        // Temel durum: uzunluk 0 veya 1 ise palindromdur
        if (kelime.length() <= 1) {
            return true;
        }
        // İlk ve son karakter eşit değilse palindrom değildir
        if (kelime.charAt(0) != kelime.charAt(kelime.length() - 1)) {
            return false;
        }
        // Ortadaki substring'i kontrol et
        return palindrom(kelime.substring(1, kelime.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(palindrom("ece"));   // true
        System.out.println(palindrom("kayak")); // true
        System.out.println(palindrom("java"));  // false
    }
}
