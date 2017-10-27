public class Dog {
    String name;
    int size;

    public void bark(int NoOfBarks) {
        while (NoOfBarks > 0) {
            if (size > 10) {
                System.out.println(name + " says Ruff! Ruff!");
            } else if (size > 5) {
                System.out.println(name + "says bark! bark!");
            } else {
                System.out.println(name + " says Gheue? gheue?");
            }
            NoOfBarks = NoOfBarks - 1;
        }
    }
}
