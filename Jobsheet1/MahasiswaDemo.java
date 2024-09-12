public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa(); //instansiasi 2 objek mhs baru
        Mahasiswa m3 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        m2.nim = "01234";
        m2.nama = "Rahmalia Mutia";
        m2.alamat = "Jombang, Jawa Timur";
        m2.kelas = "2A";
        m2.displayBiodata();

        m3.nim = "03456";
        m3.nama = "Vellicia Vasthi";
        m3.alamat = "Surabaya, Jawa Timur";
        m3.kelas = "2C";
        m3.displayBiodata();
        
    }
}
