// Mobil.java

// Deklarasi kelas Mobil
public class Mobil {
    private String merk;
    private String warna;
    private int tahunProduksi;
    private boolean menyala;

    public Mobil(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.menyala = false;
    }

    public void nyalakan() {
        this.menyala = true;
        System.out.println("Mobil " + merk + " dinyalakan.");
    }

    public void matikan() {
        this.menyala = false;
        System.out.println("Mobil " + merk + " dimatikan.");
    }

    public String getStatus() {
        if (menyala) {
            return "Mobil " + merk + " (" + warna + ", " + tahunProduksi + ") dalam keadaan menyala.";
        } else {
            return "Mobil " + merk + " (" + warna + ", " + tahunProduksi + ") dalam keadaan mati.";
        }
    }

    public void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna mobil " + merk + " diubah menjadi " + warnaBaru + ".");
    }
}
