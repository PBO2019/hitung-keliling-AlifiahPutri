public class Lingkaran {
    public static void main(String[] args) {
    berhitung hitung = new berhitung();
    hitung.hitungKeliling();
    }
    public static class berhitung{
        public double phi = 3.14;
        public int r = 21;
        public double keliling = 2*phi*r;

        void hitungKeliling(){
            System.out.print("Keliling Lingkaran = " + keliling + "cm");
        }
    }
}
