public class AdminAuthentication implements Authentication{
    String username;
    String password;

    @Override
    public boolean login(String username, String password) {
        if(this.username == username && this.password == password){
            System.out.println("Zalogowany.");
            return true;
        }
        else{
            System.out.println("Wystąpił błąd");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(this.username == username && this.password == oldPassword){
            this.password = newPassword;
            System.out.println("Hasło zostało zmienione.");
            return true;
        }
        else{
            System.out.println("Wystąpił błąd");
            return false;
        }
    }
}
