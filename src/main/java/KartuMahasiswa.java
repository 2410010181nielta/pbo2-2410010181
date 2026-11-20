public class KartuMahasiswa {
    private String nama;
    private String nim;
    private String programStudi;

    public KartuMahasiswa(String nama, String nim, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public void cetak() {
        System.out.println("=== KARTU MAHASISWA ===");
        System.out.println("Nama          : Haura Nielta Azkiya");
        System.out.println("NIM           : 2410010181");
        System.out.println("Program Studi : Teknik Informatika");
    }

    public static void main(String[] args) {
        KartuMahasiswa kartu = new KartuMahasiswa(
                "Nama Mahasiswa", "2400000000", "Teknik Informatika");
        kartu.cetak();
    }
}
