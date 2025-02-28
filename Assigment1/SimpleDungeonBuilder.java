package Assigment1;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    String name;
    List<Room> rooms;
    List<NPC> npcs;

    public SimpleDungeonBuilder() {
        reset();
    }

    public void reset() {
        name = "";
        rooms = new ArrayList<>();
        npcs = new ArrayList<>();
    }

    public IDungeonBuilder name(String n) {
        this.name = n;
        return this;
    }

    public IDungeonBuilder room(Room r) {
        rooms.add(r);
        return this;
    }

    public IDungeonBuilder npc(NPC n) {
        npcs.add(n);
        return this;
    }

    public Dungeon build() {
        Dungeon d = new Dungeon(name, rooms, npcs);
        reset();
        return d;
    }
}
