package my.buffalocow.entity;

import java.util.Objects;

public class GameSession {
    private int id;
    private int task;  // TODO: 05.03.2018 Convert to set of digits
    private User user;
    private boolean isFinished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameSession)) return false;
        GameSession that = (GameSession) o;
        return id == that.id &&
                task == that.task &&
                isFinished == that.isFinished &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, task, user, isFinished);
    }

    @Override
    public String toString() {
        return "GameSession{" +
                "id=" + id +
                ", task=" + task +
                ", user=" + user +
                ", isFinished=" + isFinished +
                '}';
    }
}
