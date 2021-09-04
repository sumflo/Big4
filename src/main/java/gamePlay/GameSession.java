package gamePlay;

import java.time.LocalDateTime;

public class GameSession {

    private int id;
    private LocalDateTime gameEndDate;

    public GameSession() {
    }

    public GameSession(int id, LocalDateTime gameEndDate) {
        this.id = id;
        this.gameEndDate = gameEndDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getGameEndDate() {
        return gameEndDate;
    }

    public void setGameEndDate(LocalDateTime gameEndDate) {
        this.gameEndDate = gameEndDate;
    }
}
