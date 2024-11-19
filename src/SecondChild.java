public class SecondChild extends Parent implements Printable{
    private int age;

    public SecondChild(String name, int age) {
        super(name);
        this.age = age;
    }


    @Override
    public void print() {
        System.out.println("Age: " + age + " Name: " + getName() );
    }
}
