package gamePlay;

import java.time.LocalDateTime;

public class GameSession {

    private int id;
    private LocalDateTime gameEndDate;

    public GameSession() {
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
