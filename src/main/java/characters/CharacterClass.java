package characters;

public enum CharacterClass {
    MAGE,
    WARRIOR,
    ROUGE,
    PRIEST,
    SHAMAN;

    public int getDBIndex() {
        return ordinal() + 1;
    }
}
