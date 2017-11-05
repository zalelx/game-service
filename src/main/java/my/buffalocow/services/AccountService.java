package my.buffalocow.services;

import my.buffalocow.users.PlayerProfile;
import my.buffalocow.users.UserProfile;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class AccountService {
    private static AccountService instance = new AccountService();
    private static AtomicLong id = new AtomicLong(0L);

    public static AccountService getInstance() {
        return instance;
    }

    Map<HttpSession, UserProfile> authorizedUsers = new ConcurrentHashMap<HttpSession, UserProfile>();
    Map<String, UserProfile> loginUserProfile = new ConcurrentHashMap<String, UserProfile>();


    public void logout(HttpSession session) {
        authorizedUsers.remove(session);
    }

    public boolean login( HttpSession session,  String login,  char[] password) {
        if (!loginUserProfile.containsKey(login)) {
            return false;
        }

        if (authorizedUsers.containsKey(session)) {
            return true;
        }

        UserProfile profile = loginUserProfile.get(login);
        if (Arrays.equals(profile.getPassword(), password)) {
            authorizedUsers.put(session, profile);
        }
        return false;
    }

    public void register(String login, char[] password) {
        PlayerProfile playerProfile = new PlayerProfile(id.getAndIncrement());
        playerProfile.setLogin(login);
        playerProfile.setPassword(password);
        loginUserProfile.put(login, playerProfile);
    }
}
