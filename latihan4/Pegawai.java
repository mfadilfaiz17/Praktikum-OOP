package latihan4;

public class Pegawai {
    protected String nama;
    protected String nomorIdentitas;

    public Pegawai(String nama, String nomorIdentitas) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
    }

    public void tampilkanDataPegawai() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Identitas: " + nomorIdentitas);
    }
}