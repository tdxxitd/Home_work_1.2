public class ThirdChild extends Parent implements Printable{
    private String weight;

    public ThirdChild(String name,String weight) {
        super(name);
        this.weight = weight;
    }



    @Override
    public void print() {
        System.out.println("Weight: " + weight + " Name: " + getName());
    }
}
