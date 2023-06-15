// Main.java

public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2022);
        
        // Membuat objek pengemudi dengan mengaitkannya dengan objek mobil
        Pengemudi pengemudi1 = new Pengemudi("John Doe", 30, mobil1);
        
        // Mengakses fitur mobil melalui pengemudi
        pengemudi1.nyalakanMobil();
        System.out.println(pengemudi1.getStatusMobil());
        
        pengemudi1.ubahWarnaMobil("Merah");
        System.out.println(pengemudi1.getStatusMobil());
        
        pengemudi1.matikanMobil();
        System.out.println(pengemudi1.getStatusMobil());
    }
}
