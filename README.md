# Dungeon Builder & Prototype Demo

## Overview

In Week 4, we explored two advanced Creational Patterns: Builder and Prototype. These patterns help solve the challenges of constructing complex objects and efficiently replicating similar objects, respectively. In this homework, you will apply what you've learned by implementing these patterns in the context of our project. You may choose one or more of the following tasks.

This project demonstrates the integration of the Builder and Prototype patterns:
- **Builder Pattern:** Used to construct a complex `Dungeon` object step-by-step. The builder (via `IDungeonBuilder` and `SimpleDungeonBuilder`) allows the addition of rooms and NPCs in a modular way.
- **Prototype Pattern:** Implemented in the `Room` class (extending `CloneableGameEntity`) to enable cloning of a template room. This allows quickly creating multiple similar rooms, with the option to modify each clone (e.g., appending "Clone #" to its name).

*Note:* All the information and example code in this project were developed based on the examples provided at [Refactoring Guru](https://refactoring.guru/ru/design-patterns/prototype/java/example#example-0).

## Project Structure
## Project Structure

- **IDungeonBuilder.java**  
  Interface defining methods for building a `Dungeon` (reset, name, room, npc, build).

- **SimpleDungeonBuilder.java**  
  Concrete implementation of the builder pattern to assemble a `Dungeon`.

- **Dungeon.java**  
  The product class representing a dungeon, which contains lists of `Room` and `NPC` objects.

- **NPC.java**  
  A simple class representing an NPC.

- **CloneableGameEntity.java**  
  Abstract class providing a base for prototype cloning (with a `cloneEntity()` method).

- **Room.java**  
  A room class that supports cloning through the Prototype pattern.

- **MUDCombinedDemo.java**  
  Demo class that:
  - Uses the builder to create a basic `Dungeon`.
  - Clones a template `Room` multiple times (with modifications) to add them to the dungeon.

Expected Output

The output will display a formatted description of the constructed dungeon, including indented lists of rooms and NPCs. For example:
Dungeon Name: Mysterious Dungeon

Rooms:
   Room[name=Template Room, description=A standard room., type=Standard]
   Room[name=Template Room Clone #1, description=A standard room., type=Standard]
   Room[name=Template Room Clone #2, description=A standard room., type=Standard]
   Room[name=Template Room Clone #3, description=A standard room., type=Standard]

NPCs:
   Guardian

   
*Note:* All the information and example code in this project were developed based on the examples provided at [Refactoring Guru](https://refactoring.guru/ru/design-patterns/prototype/java/example#example-0)


   
