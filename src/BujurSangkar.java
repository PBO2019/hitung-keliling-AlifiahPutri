class BujurSangkar {
    public static void main(String[] args) {
        Berhitung hitung = new Berhitung();
        hitung.hitungKeliling();
    }

    public static class Berhitung {
        public int sisi = 4;
        public int hasil = 4 * sisi;

        void hitungKeliling() {
            System.out.print("Keliling Bujur Sangkar = " + hasil +"cm");
        }
    }
}
