package quiz1;

public class UkmRpi extends UKM {
    public UkmRpi(String nama, String nim, String prodi, int tahunMasuk, String jabatan, int tahunBergabung) {
        super(nama, nim, prodi, tahunMasuk, "UKM Robotika Polindra (RPI)", jabatan, tahunBergabung);
    }
    @Override
    public void tampilkanProker() {
        System.out.println("Program Kerja  : Pembuatan prototipe robot, simulasi ROS, dan Kontes Robot Indonesia.");
    }
}