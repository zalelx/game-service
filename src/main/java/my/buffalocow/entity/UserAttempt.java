package my.buffalocow.entity;

import java.util.Objects;

public class UserAttempt {
    private int id;
    private GameSession gameSession;
    private int userAttempt; // TODO: 05.03.2018 Convert to set of digits

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameSession getGameSession() {
        return gameSession;
    }

    public void setGameSession(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    public int getUserAttempt() {
        return userAttempt;
    }

    public void setUserAttempt(int userAttempt) {
        this.userAttempt = userAttempt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAttempt)) return false;
        UserAttempt that = (UserAttempt) o;
        return id == that.id &&
                userAttempt == that.userAttempt &&
                Objects.equals(gameSession, that.gameSession);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, gameSession, userAttempt);
    }

    @Override
    public String toString() {
        return "UserAttempt{" +
                "id=" + id +
                ", gameSession=" + gameSession +
                ", userAttempt=" + userAttempt +
                '}';
    }
}
