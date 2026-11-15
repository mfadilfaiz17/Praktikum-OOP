package quiz1;

public class HimaRpl extends HIMA {
    public HimaRpl(String nama, String nim, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, "Rekayasa Perangkat Lunak", tahunMasuk, "HIMA RPL", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Hackathon pengembangan aplikasi dan sertifikasi developer.");
    }
}