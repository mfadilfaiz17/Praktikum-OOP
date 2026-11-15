package quiz1;

public class AnggotaOrmawa extends Mahasiswa {
    private String namaOrganisasi;
    private String jabatan;
    private int tahunBergabung;

    public AnggotaOrmawa(String nama, String nim, String prodi, int tahunMasuk, String namaOrganisasi, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk);
        this.namaOrganisasi = namaOrganisasi;
        this.jabatan = jabatan;
        this.tahunBergabung = tahunBergabung;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData(); 
        System.out.println("Organisasi     : " + namaOrganisasi);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Tahun Gabung   : " + tahunBergabung);
    }

    public void tampilkanProker() {
        System.out.println("Belum ada proker spesifik.");
    }
}