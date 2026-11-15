package quiz1;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== 1. DATA ANGGOTA HIMA TERAKOM ===");
        HimaTerakom mhs1_hima = new HimaTerakom(
            "M. Fadil Faiz", "2509005", 2025, "Divisi Ristek", 2026
        );
        mhs1_hima.tampilkanData("Aktif (Pengurus)");
        mhs1_hima.tampilkanProker();
        
        System.out.println("\n=== 2. DATA ANGGOTA UKM ROBOTIKA (RPI) ===");
        UkmRpi mhs1_ukm = new UkmRpi(
            "M. Fadil Faiz", "2509005", "Teknologi Rekayasa Komputer", 2025, "Anggota Aktif", 2026
        );
        mhs1_ukm.tampilkanData();
        mhs1_ukm.tampilkanProker();


        System.out.println("\n=== 3. DATA PENGURUS BEM ===");
        BEM mhs2_bem = new BEM(
            "Ahmad Sumbul", "25042211", "Keperawatan", 2024, "Menteri Kominfo", 2025
        );
        mhs2_bem.tampilkanData("Aktif");
        mhs2_bem.tampilkanProker();

        System.out.println("\n=== 4. DATA PENGURUS MPM ===");
        MPM mhs2_mpm = new MPM(
            "Ahmad Sumbul", "25042211", "Keperawatan", 2024, "Anggota Komisi Pengawasan", 2025
        );
        mhs2_mpm.tampilkanData("Aktif");
        mhs2_mpm.tampilkanProker();


        System.out.println("\n=== 5. DATA ANGGOTA HIMA RPL ===");
        HimaRpl mhs3_hima = new HimaRpl(
            "Lucas Paskes", "25043322", 2025, "Ketua Pelaksana Hackathon", 2026
        );
        mhs3_hima.tampilkanData();
        mhs3_hima.tampilkanProker();

        System.out.println("\n=== 6. DATA ANGGOTA UKM SENI BUDAYA (SEBURA) ===");
        UkmSebura mhs3_ukm = new UkmSebura(
            "Lucas Paskes", "25043322", "Rekayasa Perangkat Lunak", 2025, "Divisi Teater", 2026 );
        mhs3_ukm.tampilkanData();
        mhs3_ukm.tampilkanProker();


        System.out.println("\n=== 7. DATA ANGGOTA HIMA SIKC ===");
        HimaSikc mhs4 = new HimaSikc(
            "Nina", "25044433", 2025, "Sekretaris", 2026
        );
        mhs4.tampilkanData();
        mhs4.tampilkanProker();

        System.out.println("\n=== 8. DATA ANGGOTA HIMATIF ===");
        Himatif mhs5 = new Himatif(
            "Dimas", "25045544", 2024, "Ketua Himpunan", 2025
        );
        mhs5.tampilkanData("Aktif (Demisioner)");
        mhs5.tampilkanProker();

        System.out.println("\n=== 9. DATA ANGGOTA UKM OLAHRAGA (POPI) ===");
        UkmPopi mhs6 = new UkmPopi(
            "Supri", "25046655", "Teknik Mesin", 2025, "Atlet Futsal", 2025
        );
        mhs6.tampilkanData();
        mhs6.tampilkanProker();

        System.out.println("\n=== 10. DATA ANGGOTA FORUM KOMUNITAS ===");
        ForumKomunitas mhs7 = new ForumKomunitas(
            "Budi", "25047766", "Perancangan Manufaktur", 2025, 
            "Forum Mahasiswa Indramayu (FORMI)", "Anggota Humas", 2026
        );
        mhs7.tampilkanData();
        mhs7.tampilkanProker();
    }
}