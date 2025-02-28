package Assigment3;
import java.util.List;

public class Dungeon {
    String name;
    List<Room> rooms;
    List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<NPC> getNPCs() {
        return npcs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dungeon Name: ").append(name).append("\n\n");
        sb.append("Rooms:\n");
        for (Room room : rooms) {
            sb.append("   ").append(room.toString()).append("\n");
        }
        sb.append("\nNPCs:\n");
        for (NPC npc : npcs) {
            sb.append("   ").append(npc.toString()).append("\n");
        }
        return sb.toString();
    }
}