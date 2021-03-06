package my.buffalocow.mechanics;

import my.buffalocow.users.UserProfile;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class GameSession {
    private static final int MAX_VALUE = 10;
    public static final int DIFFICULTY = 4;

    private Set<Integer> task = new LinkedHashSet<Integer>(DIFFICULTY);
    private UserProfile player;

    public void init() {
        Random random = new Random();
        while (task.size() < DIFFICULTY) {
            task.add(random.nextInt(MAX_VALUE));
        }

    }

    public Set<Integer> getTask() {
        return task;
    }

    public UserProfile getPlayer() {
        return player;
    }

    public void setPlayer(UserProfile player) {
        this.player = player;
    }
}
