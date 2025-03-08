package Interface_Abstract_Samples;

public abstract class Animal {
    abstract void sound();

    public void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Hav hav ");
    }
}