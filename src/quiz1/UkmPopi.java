package quiz1;

public class UkmPopi extends UKM {
    public UkmPopi(String nama, String nim, String prodi, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, "UKM Olahraga (POPI)", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Turnamen futsal kampus dan pembinaan atlet mahasiswa.");
    }
}