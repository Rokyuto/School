package OOP_Abstraction;

public class OOP_Bases implements Interface {
    public static void main(String[] args) {
        System.out.println(i);
        Interface myInterface = new OOP_Bases(); // Create OOP_Abstraction.Interface Object that is class Instance
        myInterface.HelloAbs(); // Abstract class can be called with OOP_Abstraction.Interface Object who instance the class
        Interface.Hello(); // Default/Normal method can be called by InterfaceName.methodName
    }

    @Override
    public void HelloAbs() {
        System.out.println("Hello ABS");
    }
}
