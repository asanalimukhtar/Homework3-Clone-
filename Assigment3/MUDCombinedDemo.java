package Assigment3;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Room tempRoom = new Room();
        tempRoom.name = "Template Room";
        tempRoom.description = "A standard room.";
        tempRoom.roomType = "Standard";
        Dungeon dungeon = builder.name("Mysterious Dungeon")
                .room(tempRoom)
                .npc(new NPC("Guardian"))
                .build();

        for (int i = 1; i <= 3; i++) {
            Room clonedRoom = (Room) tempRoom.cloneEntity();
            clonedRoom.name += " Clone #" + i;
            dungeon.getRooms().add(clonedRoom);
        }

        System.out.println(dungeon);
    }
}