package latihan4;

public class Dosen extends Pegawai {
    private String bidangKeahlian;
    private int jumlahSks;

    public Dosen(String nama, String nomorIdentitas, String bidangKeahlian, int jumlahSks) {
        super(nama, nomorIdentitas);
        this.bidangKeahlian = bidangKeahlian;
        this.jumlahSks = jumlahSks;
    }

    public void tampilkanDataDosen() {
        super.tampilkanDataPegawai();
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Jumlah SKS: " + jumlahSks + "\n");
    }
}
