// Pengemudi.java

// Deklarasi kelas Pengemudi
public class Pengemudi {
    private String nama;
    private int umur;
    private Mobil mobil;

    public Pengemudi(String nama, int umur, Mobil mobil) {
        this.nama = nama;
        this.umur = umur;
        this.mobil = mobil;
    }

    public void nyalakanMobil() {
        mobil.nyalakan();
    }

    public void matikanMobil() {
        mobil.matikan();
    }

    public String getStatusMobil() {
        return "Pengemudi: " + nama + ", Umur: " + umur + "\n" + mobil.getStatus();
    }

    public void ubahWarnaMobil(String warnaBaru) {
        mobil.ubahWarna(warnaBaru);
    }
}
