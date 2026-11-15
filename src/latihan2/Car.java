package latihan2;

public class Car {
    String merk;
    String seri;
    String warna;
    String spek;
    int tahun;
    Boolean tersedia;

    int sewaPerHari(int hari){
        int hargaSewa = 500000;
        return hargaSewa * hari;
    }

    int hitungHargaSewa(int hari, int hargaSewa, int lamaSewa){
        int totalHarga = hargaSewa * lamaSewa;
        return totalHarga;
    }

    class mobilelectric extends car {
        string jenisBaterai;
        int lamaBaterai;

        string statusBaterai() {
            return "Kapasitas Baterai: " + lamaBaterai + " Kwh";
        }
    }

    String tersedia(){
        if (tersedia) {
            return "Mobil tersedia untuk disewa";
        } else {
            return "Mobil tidak tersedia untuk disewa";
        }
    }
}
