public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; // inches

    public Bird (String species, String name, boolean HasOwner, int age, double weight, String food)
    {
        super(name, HasOwner, age, weight, food);
        this.species = species;
    }//end full constructor which call super

    public int monthlyFeeding()
    {
        return 8;
    }

    public String Speak()
    {
        return "The Universe is a simulation";
    }

    public String toString()
    {
        String output = super.toString() + "\nColor: " + color;
        output += "\nWingspan: " + wingspan +" inches";
        output += "\nSpecies: " + species;
        return output;
    }// end toString with call to Super

}
