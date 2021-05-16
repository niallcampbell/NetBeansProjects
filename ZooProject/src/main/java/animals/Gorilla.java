package animals;

public class Gorilla extends Animal {
    
    private final String name = "Gorilla";
    private final int age;
    
    public Gorilla(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public void printDetails() {
    
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
