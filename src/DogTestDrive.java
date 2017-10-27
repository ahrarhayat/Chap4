public class DogTestDrive {


    public static void main(String args[]) {
        Dog one = new Dog();
        one.name = "German Shepherd";
        one.size = 20;
        Dog two = new Dog();
        two.name = "Bull Dog";
        two.size = 7;
        Dog three = new Dog();
        three.name = "Deshi";
        three.size = 4;
        one.bark(1);
        two.bark(0);
        three.bark(2);
    }



}
