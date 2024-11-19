public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("FirstChild");
        objects[1] = createObject("FirstChild");
        objects[2] = createObject("FirstChild");
    }
    public static Printable createObject(String className) {
        switch (className) {
            case "FirstChild":
                return new FirstChild("Alex", "Chess");
                case "SecondChild":
                    return new SecondChild("Alina", 17);
                    case "ThirdChild":
                        return new ThirdChild("John", "56 kg");
            default:
                System.out.println("Unknown class name: " + className);
        }
        return null;
    }
}