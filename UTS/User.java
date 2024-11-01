public class User extends UserProfile {
    
    public User(int user_id, String password, String name, int age,String email_id){
        super(user_id,password,name,age,email_id);
    }

    public boolean logIn(int userId, String password) {
        if (getUserId() == userId && getPassword().equals(password)) {
            System.out.println("Login berhasil.");
            return true;
        }
        System.out.println("Login gagal.");
        return false;
    }

    public void logOut() {
        System.out.println("Pengguna berhasil logout.");
    }

}
