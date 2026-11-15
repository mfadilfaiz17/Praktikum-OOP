package quiz1;

public class BEM extends AnggotaOrmawa {
    public BEM(String nama, String nim, String prodi, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, "BEM Polindra", jabatan, tahunBergabung);
    }

    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Mengawal aspirasi mahasiswa dan program eksekutif kampus.");
    }
}