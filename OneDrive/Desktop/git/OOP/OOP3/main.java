package OOP3;

public class main {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.eat();

        System.out.println();

        Animal herbivores = new Animal();
        herbivores.eat("herbivores");
    }
}
