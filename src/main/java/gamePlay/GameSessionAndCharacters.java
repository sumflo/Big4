package gamePlay;

public class GameSessionAndCharacters {

    private long ID;
    private long game_session_ID;
    private long player_char_ID;
    private int character_level;
    private int character_xp;

    public GameSessionAndCharacters(){

    }
    public GameSessionAndCharacters(long ID, long game_session_ID, long player_char_ID,int character_level, int character_xp){
    this.ID = ID;
    this.game_session_ID = game_session_ID;
    this.player_char_ID = player_char_ID;
    this.character_level = character_level;
    this.character_xp = character_xp;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getGame_session_ID() {
        return game_session_ID;
    }

    public void setGame_session_ID(long game_session_ID) {
        this.game_session_ID = game_session_ID;
    }

    public long getPlayer_char_ID() {
        return player_char_ID;
    }

    public void setPlayer_char_ID(long player_char_ID) {
        this.player_char_ID = player_char_ID;
    }

    public int getCharacter_level() {
        return character_level;
    }

    public void setCharacter_level(int character_level) {
        this.character_level = character_level;
    }

    public int getCharacter_xp() {
        return character_xp;
    }

    public void setCharacter_xp(int character_xp) {
        this.character_xp = character_xp;
    }
}
