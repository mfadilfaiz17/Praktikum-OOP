package latihan4;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Fulan", "D001", "Algoritma Pemrograman", 12);
        Dosen dosen2 = new Dosen("Fulanah", "D002", "Jaringan Komputer", 10);

        Staf staf1 = new Staf("Mas A", "S001", "Akademik", 8);
        Staf staf2 = new Staf("Mbak O", "S002", "Keuangan", 8);

        System.out.println("=== DATA DOSEN ===");
        dosen1.tampilkanDataDosen();
        dosen2.tampilkanDataDosen();

        System.out.println("=== DATA STAF ===");
        staf1.tampilkanDataStaf();
        staf2.tampilkanDataStaf();
    }
}