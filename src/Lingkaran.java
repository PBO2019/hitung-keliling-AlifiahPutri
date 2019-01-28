public class Lingkaran {
    private double keliling ;
    private int r;
    private double phi ;

    public void hitungLingkaran(){
        this.keliling =  2*phi*r;
    }
    public void setR(int r){
        this.r = r;
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    public double getKeliling(){
        return keliling;
    }
}
