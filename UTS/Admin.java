public class Admin extends User {
    private String merek;
    private String model;
    private double harga;
    private String jenisBahanBakar;
    private String tahun;

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void setMerk(String merek){
        this.merek = merek;
    }

    public String getMerek(){
        return merek;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }
    public String getJenisBahanBakar(){
        return jenisBahanBakar;
    }
    public void setJenisBahanBakar(){
        this.jenisBahanBakar = jenisBahanBakar;
    }
    public String getTahun(){
        return tahun;
    }
    public void setTahun(){
        this.tahun = tahun;
    }
    public void addVehicle(String m, String mdl, double h) {
        merek = m;
        model = mdl;
        harga = h;
        System.out.println("Kendaraan dengan " +merek+" ditambahkan" );
    }

    public String infoKendaraan(){
        String info = "";
        info += "Merek          : "+merek+"\n";
        info += "Model          : "+model+"\n";
        info += "Harga          : "+harga+"\n";
        info += "Tahun          : "+tahun+"\n";
        info += "Jenis Bahan Bakar : " +jenisBahanBakar+"\n";

        return info;
    }

    public void retrieveComplain() {
        System.out.println("Keluhan diambil.");
    }

    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("Pengguna terverifikasi.");
        } else {
            System.out.println("Pengguna belum terverifikasi.");
        }
    }
}
