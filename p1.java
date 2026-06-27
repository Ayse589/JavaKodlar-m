public class p1 {
    public static void main(String[] args) {
        String str = "kapak";
        String temp = "";
        
        // Build reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        
        System.out.println("Orijinal: " + str);
        System.out.println("Tersi: " + temp);
        
        // Check if palindrome
        if (temp.equals(str)) {
            System.out.println("Palindromik!");
        } else {
            System.out.println("Palindromik degil!");
        }
    }
}
