package my.buffalocow.users;


public class PlayerProfile implements UserProfile {
    public PlayerProfile(long id) {

    }

    public long getId() {
        return 0;
    }

    public String getLogin() {
        return null;
    }

    public void setLogin(String login) {

    }

    public void setPassword(char[] password) {

    }

    public char[] getPassword() {
        return new char[0];
    }

    public boolean isAdmin() {
        return false;
    }
}
