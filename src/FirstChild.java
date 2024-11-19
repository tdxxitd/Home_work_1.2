public class FirstChild extends Parent implements Printable{
    private String hobby;

    public FirstChild(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }



    @Override
    public void print() {
        System.out.println("Hobby: " + hobby + " Name: " + getName());
    }
}
