public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        if (doc.endsWith(".jpg") || doc.endsWith(".png") || doc.endsWith(".pdf")) {
            verificationStatus = true;
            System.out.println("Verifikasi diajukan dengan dokumen: " + doc);
        } else {
            System.out.println("Format dokumen tidak valid.");
        }
    }

    public void keluhan(String keluhan){
        System.out.println("Terimakasih! keluhan anda kami terima");
    }
}
