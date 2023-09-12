public class Agung_Wicaksono_TugasPBO_1_2 {
    public static void main(String[] args) {
        bebas segitiga = new bebas(5, 3);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}

class bebas {
    private double kali = 0.5;
    private double alas;
    private double tinggi;

    public bebas(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return kali * alas *tinggi;
    }
}