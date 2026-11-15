package latihan4;

public class Staf extends Pegawai {
    private String bagianKerja;
    private int jamKerja;

    public Staf(String nama, String nomorIdentitas, String bagianKerja, int jamKerja) {
        super(nama, nomorIdentitas);
        this.bagianKerja = bagianKerja;
        this.jamKerja = jamKerja;
    }

    public void tampilkanDataStaf() {
        super.tampilkanDataPegawai();
        System.out.println("Bagian Kerja: " + bagianKerja);
        System.out.println("Jam Kerja per Hari: " + jamKerja + "\n");
    }
}