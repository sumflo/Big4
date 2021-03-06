package characters;

public class  PlayedCharacter {

    private int id;
    private String playerName;
    private int characterId;

    public PlayedCharacter() {
    }

    public PlayedCharacter(int id, String playerName, int characterId) {
        this.id = id;
        this.playerName = playerName;
        this.characterId = characterId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }
}
