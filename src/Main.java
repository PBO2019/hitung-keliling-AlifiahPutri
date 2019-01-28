public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Lingkaran bulat = new Lingkaran();
        BujurSangkar petak = new BujurSangkar();

        petak.setSisi(5);
        petak.hitungKeliling();
        System.out.println("Keliling BujurSangkar = " + petak.getKeliling());

        bulat.setR(7);
        bulat.setPhi(3.14);
        bulat.hitungLingkaran();
        System.out.println("Keliling Lingkaran = " + bulat.getKeliling());
    }
}
