package quiz1;

public class MPM extends AnggotaOrmawa {
    public MPM(String nama, String nim, String prodi, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, "MPM Polindra", jabatan, tahunBergabung);
    }

    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Legislasi, pengawasan BEM, dan audit kelembagaan mahasiswa.");
    }
}