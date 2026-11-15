package quiz1;

public class HimaTerakom extends HIMA {
    public HimaTerakom(String nama, String nim, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, "Teknologi Rekayasa Komputer", tahunMasuk, "HIMA TERAKOM", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Pelatihan Cyber Security, riset teknologi, dan kompetisi IT.");
    }
}