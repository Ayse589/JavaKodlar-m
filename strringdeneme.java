public class strringdeneme {
    public static void main(String[] args) {
        // String operations example
        String str1 = "Merhaba dünya";
        char[] cDizi = new char[7];
        str1.getChars(8, 13, cDizi, 0);
        
        System.out.println("Karakterler:");
        for (int i = 0; i < cDizi.length; i++) {
            System.out.println(cDizi[i]);
        }
        
        // Other string operations
        String str2 = "  SDUCeng  ";
        String str3 = str2.replace('U', 'Ü');
        System.out.println("Degistirilen: " + str3);
        System.out.println("Uzunluk: " + str2.length());
        
        String str4 = "Bugün hava çok güzel";
        String[] kelimeler = str4.split(" ");
        System.out.println("Kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
    }
}


