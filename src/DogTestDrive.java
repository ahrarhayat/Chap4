public class DogTestDrive {


    public static void main(String args[]) {
        Dog one = new Dog();
        one.name = "German Shepherd";
        one.setSize(20);
        Dog two = new Dog();
        two.name = "Bull Dog";
        two.setSize(10);
        Dog three = new Dog();
        three.name = "Deshi";
        three.setSize(0);
        one.bark(1);
        two.bark(1);
        three.bark(1);
    }



}
