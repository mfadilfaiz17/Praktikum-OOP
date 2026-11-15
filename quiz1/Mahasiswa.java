package quiz1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private int tahunMasuk;

    public Mahasiswa(String nama, String nim, String prodi, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }

    public void tampilkanData() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Tahun Masuk    : " + tahunMasuk);
    }

    public void tampilkanData(String statusAktif) {
        tampilkanData();
        System.out.println("Status         : " + statusAktif);
    }
}