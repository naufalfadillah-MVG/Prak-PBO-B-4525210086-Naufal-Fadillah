public class Main {

    public static void main(String[] args) {

        // Pembuatan objek biasa (tanpa anonymous class)
        Kopi kopiBiasa = new Kopi();

        // Anonymous class untuk kopiSusu
        Kopi kopiSusu = new Kopi() {
            @Override
            public void racik() {
                System.out.println("Racikan 1: Espresso + Susu UHT + Gula Aren.");
            }
        };

        kopiBiasa.racik();
        kopiSusu.racik();
    }
}