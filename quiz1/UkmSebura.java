package quiz1;

public class UkmSebura extends UKM {
    public UkmSebura(String nama, String nim, String prodi, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, "UKM Seni Budaya (SEBURA)", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Pagelaran seni, latihan musik, dan pentas teater tahunan.");
    }
}
