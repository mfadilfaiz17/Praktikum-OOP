package quiz1;

public class ForumKomunitas extends AnggotaOrmawa {
    public ForumKomunitas(String nama, String nim, String prodi, int tahunMasuk, String namaForum, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, namaForum, jabatan, tahunBergabung);
    }

    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Diskusi lintas prodi dan pengabdian masyarakat.");
    }
}