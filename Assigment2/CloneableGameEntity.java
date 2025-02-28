package Assigment2;

import java.util.Objects;

public abstract class CloneableGameEntity {
    public String name;
    public String description;
    public CloneableGameEntity() { }
    public CloneableGameEntity(CloneableGameEntity target) {
        if (target != null) {
            this.name = target.name;
            this.description = target.description;
        }
    }

    public abstract CloneableGameEntity cloneEntity();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CloneableGameEntity)) return false;
        CloneableGameEntity other = (CloneableGameEntity) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.description, other.description);
    }
}