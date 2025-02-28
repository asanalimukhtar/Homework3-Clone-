package Assigment1;

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
            return "Dungeon Name: " + name + "\n" +
                    "Rooms: " + rooms + "\n" +
                    "NPCs: " + npcs;
        }
    }
