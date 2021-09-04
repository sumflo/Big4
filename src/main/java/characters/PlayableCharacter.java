package characters;

public class PlayableCharacter {
    private long characterID;
    private String characterName;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private byte[] characterImg;
    private String characterSkill1;
    private String characterSkill2;
    private String characterSkill3;

    public PlayableCharacter() {
    }

    public PlayableCharacter(String characterName, CharacterClass characterClass, CharacterRace characterRace) {
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
    }

    public PlayableCharacter(long characterID, String characterName, CharacterClass characterClass, CharacterRace characterRace) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
    }

    public long getCharacterID() {
        return characterID;
    }

    public void setCharacterID(long characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterRace getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(CharacterRace characterRace) {
        this.characterRace = characterRace;
    }

    public byte[] getCharacterImg() {
        return characterImg;
    }

    public void setCharacterImg(byte[] characterImg) {
        this.characterImg = characterImg;
    }

    public String getCharacterSkill1() {
        return characterSkill1;
    }

    public void setCharacterSkill1(String characterSkill1) {
        this.characterSkill1 = characterSkill1;
    }

    public String getCharacterSkill2() {
        return characterSkill2;
    }

    public void setCharacterSkill2(String characterSkill2) {
        this.characterSkill2 = characterSkill2;
    }

    public String getCharacterSkill3() {
        return characterSkill3;
    }

    public void setCharacterSkill3(String characterSkill3) {
        this.characterSkill3 = characterSkill3;
    }
}
