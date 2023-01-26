package OOP_lectures.src.OOP_Abstraction;

public interface Interface {
    int i = 10; // In the Interfaces the variables are public final static = public constants variables = can't be edited from outside
    static void Hello(){ // Default method (with code block)
        System.out.println("Hello");
    }
    void HelloAbs(); // by default methods in abstract OOP_Abstraction.Interface are public abstract
}
