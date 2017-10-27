public class Dog {
    String name;
  private   int size ;

  public int getSize(){

      return size;
    }
    public void setSize(int s)
    {
        if(s>0){
            size =s;
        }
        else {
            System.out.println("Size must be greater than 0");
        }

    }

    public void bark(int NoOfBarks) {
        while (NoOfBarks > 0) {
            if (size > 10) {
                System.out.println(name   + " says Ruff! Ruff!");
            } else if (size > 5) {
                System.out.println(name + "says bark! bark!");
            } else {
                System.out.println(name + " says Gheue? gheue?");
            }
            NoOfBarks = NoOfBarks - 1;
        }
    }
}
