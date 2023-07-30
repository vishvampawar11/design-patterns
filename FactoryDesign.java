import java.util.Scanner;

interface Character {
    void display();

    void attack();
}

class Warrior implements Character {
    public void display() {
        System.out.println("Warrior");
    }

    public void attack() {
        System.out.println("Attacks with a sword!");
    }
}

class Mage implements Character {
    public void display() {
        System.out.println("Mage");
    }

    public void attack() {
        System.out.println("Casts a fireball!");
    }
}

class Archer implements Character {
    public void display() {
        System.out.println("Archer");
    }

    public void attack() {
        System.out.println("Shoots arrows with a bow!");
    }
}

interface CharacterFactory {
    Character createCharacter();
}

class WarriorFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Warrior();
    }
}

class MageFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Mage();
    }
}

class ArcherFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Archer();
    }
}

public class FactoryDesign {

    public static void playGame(CharacterFactory characterFactory) {
        Character character = characterFactory.createCharacter();
        character.display();
        character.attack();
    }

    public static void main(String[] args) {
        System.out.println("Choose your character:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                WarriorFactory warriorFactory = new WarriorFactory();
                playGame(warriorFactory);
                break;
            }
            case 2: {
                MageFactory mageFactory = new MageFactory();
                playGame(mageFactory);
                break;
            }
            case 3: {
                ArcherFactory archerFactory = new ArcherFactory();
                playGame(archerFactory);
                break;
            }

            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
