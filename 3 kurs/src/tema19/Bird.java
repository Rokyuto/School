package tema19;

class Bird extends Animal{
    @Override
    public void sing() {
        System.out.println("Bird Sing");
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
}