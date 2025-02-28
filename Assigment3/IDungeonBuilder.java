package Assigment3;

public interface IDungeonBuilder {
    void reset();
    IDungeonBuilder name(String n);
    IDungeonBuilder room(Room r);
    IDungeonBuilder npc(NPC n);
    Dungeon build();
}
