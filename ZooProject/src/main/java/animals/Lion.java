package animals;

public class Lion extends Animal {
    
    private final String name = "Lion";
    private final int age;
    
    public Lion(int age) {
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
