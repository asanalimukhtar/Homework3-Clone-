package Assigment1;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder b = new SimpleDungeonBuilder();
        Dungeon d = b.name("Mysterious Maze")
                .room(new Room("Entrance Hall"))
                .room(new Room("Goblin Lair"))
                .npc(new NPC("Goblin King"))
                .build();
        System.out.println("Dungeon Built:");
        System.out.println(d);
    }
}