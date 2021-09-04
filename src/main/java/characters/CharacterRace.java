package characters;

public enum CharacterRace {
    HUMAN,
    ORC,
    ELF,
    UNDEAD,
    HALFLING;

    public int getDBIndex() {
        return ordinal() + 1;
    }
}
