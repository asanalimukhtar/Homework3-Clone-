package Assigment3;

public class Room extends CloneableGameEntity {
    public String roomType;

    public Room() { }

    public Room(Room target) {
        super(target);
        if (target != null) {
            this.roomType = target.roomType;
        }
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new Room(this);
    }

    @Override
    public String toString() {
        return "Room[name=" + name + ", description=" + description + ", type=" + roomType + "]";
    }
}
