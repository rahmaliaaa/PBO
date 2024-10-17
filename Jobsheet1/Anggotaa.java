public class Anggotaa {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    // Constructor
    public Anggotaa(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0; // Awalnya belum ada pinjaman
    }

    // Getter untuk nomorKTP
    public String getNomorKTP() {
        return nomorKTP;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk limitPeminjaman
    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }

    // Getter untuk jumlahPinjaman
    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pinjaman harus lebih dari 0.");
        } else if (jumlahPinjaman + jumlah > limitPeminjaman) {
            System.out.println("Pinjaman melebihi limit peminjaman.");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Berhasil meminjam: Rp" + jumlah);
        }
    }

    // Method untuk mengangsur pinjaman
    public void angsur(double jumlah) {
        double minimalAngsuran = jumlahPinjaman * 0.1;

        if (jumlah <= 0) {
            System.out.println("Jumlah angsuran harus lebih dari 0.");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        } else if (jumlah < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
            System.out.println("Berhasil mengangsur: Rp" + jumlah);
        }
    }
}
