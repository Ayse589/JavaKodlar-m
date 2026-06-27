public class tersssten {

    public static String terstenYazdir(String cumle) {
        String[] kelimeler = cumle.split(" ");
        String ters = "";

        for (int i = kelimeler.length - 1; i >= 0; i--) {
            ters += kelimeler[i];
            if (i != 0) {
                ters += " ";
            }
        }

        return ters;
    }

    public static void main(String[] args) {
        String cumle = "gunesli bir gun";
        System.out.println(terstenYazdir(cumle));
    }
}