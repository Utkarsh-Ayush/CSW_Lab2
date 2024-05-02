package Assignment2.Q6;

class Animal{
    String name, color, type;
    Animal(String name, String color, String type){
        this.name=name;
        this.color=color;
        this.type=type;
    }
    @Override
    public int hashCode() {
        // Generate a unique ID based on object properties
        return (name.hashCode() + color.hashCode() + type.hashCode()) % Integer.MAX_VALUE;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", "Black", "Domestic");
        Animal a2 = new Animal("Cat", "White", "Domestic");
        Animal a3 = new Animal("Lion", "Brown", "Wild");
        System.out.println("Hashcode for dog:"+a1.hashCode());
        System.out.println("Hashcode for cat:"+a2.hashCode());
        System.out.println("Hashcode for lion:"+a3.hashCode());
    }
    
}
