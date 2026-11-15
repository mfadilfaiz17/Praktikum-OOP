package latihan2;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.merk = "Nissan";
        car1.seri = "Sport Car";
        car1.warna = "Merah";
        car1.spek = "Mesin 2000cc";
        car1.tahun = 2020;
        car1.tersedia = false;

        car2.merk = "Toyota";
        car2.seri = "SUV";
        car2.warna = "Hitam";
        car2.spek = "Mesin 2500cc";
        car2.tahun = 2021;
        car2.tersedia = true;


        car1.sewaPerHari(7);
        int sewa = car1.hitungHargaSewa(7, 500000, 7);
        System.out.println("Total harga sewa mobil: " + sewa);
        System.out.println(car1.tersedia());

        car2.sewaPerHari(14);
        int sewa2 = car2.hitungHargaSewa(14, 500000, 14);
        System.out.println("Total harga sewa mobil: " + sewa2);
        System.out.println(car2.tersedia());
    }
}
