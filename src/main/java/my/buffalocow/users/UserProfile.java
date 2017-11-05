package my.buffalocow.users;

public interface UserProfile {
    public long getId();
    public String getLogin();
    public void setLogin(String login);
    public void setPassword(char[] password);
    public char[] getPassword();
    // TODO: 22.10.2017 add salting

    public boolean isAdmin();
}
