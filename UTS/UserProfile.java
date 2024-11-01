public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    
    public UserProfile(int ID, String p, String n, int a, String eID){
        user_id = ID;
        password  = p;
        name = n;
        age = a;
        email_id = eID; 
    }
    public int getUserId(){
        return user_id;
    }
    public String getPassword(){  
        return password;
    }
    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public String getEmailId(){
        return email_id;
    }

    public void recoverPassword(String email, String inputpass) {
        if (getEmailId().equals(email)) {
            password = inputpass;
            System.out.println("password berhasil diganti");
        } else {
            System.out.println("masukkan email yang benar");
        }
    }

  public void editProfile(String newName, int newAge, String newEmail) {
        this.name = newName;
        this.age = newAge;
        this.email_id = newEmail;
        System.out.println("Profil berhasil diperbarui.");
    }
    public String infoUser(){
        String info = "";

        info += "User ID        : "+user_id+"\n";
        info += "Password       : "+password+"\n";
        info += "Name           : "+name+"\n";
        info += "Age            : "+age+"\n";
        info += "Email ID       : "+email_id+"\n";

        return info;
    }
    @Override
    public String toString() {
        return String.format(
            "User ID        : %d%n" +
            "Password       : %s%n" +
            "Name           : %s%n" +
            "Age            : %d%n" +
            "Email ID       : %s%n",
            user_id, password, name, age, email_id);
    }
}
