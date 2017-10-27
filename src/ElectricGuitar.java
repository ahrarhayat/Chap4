public class ElectricGuitar {
    String brand;
    boolean RockstarUsesit;
    int NumberOfPickups;

    String getBrand()
    {
        return brand;
    }
    void  setBrand()
    {
        brand = "a brand";

    }
    int getNumberOfPickups()
    {
        return NumberOfPickups;
    }
    void setNumberOfPickups(int num)
    {
        NumberOfPickups= num;
    }
    boolean getRockstarUsesit(){
        return RockstarUsesit;
    }
    void setRockstarUsesit(boolean YesOrNo)
    {
        RockstarUsesit = YesOrNo;
    }
}

