import java.text.DecimalFormat; // to format the weight in pounds
public abstract class Pet
{
    //Instance Variables
    protected String name;
    protected int age;
    protected double weight; //in kg
    protected boolean HasOwner;
    public String food;
    private final double lbsToKgs = 0.454;
    abstract  public int monthlyFeeding();


    DecimalFormat fmt = new DecimalFormat("#.#"); // create formatting object

    //constructors
    public Pet (String name, boolean HasOwner, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
        this.HasOwner = HasOwner;
    }// end full constructor called child classes

    //Getters
    public String getName()
    {
        return name;
    }//end name getter

    public int getAge()
    {
        return age;
    }

    public double lbsToKgs()
    {
        return weight * lbsToKgs;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//end name setter

    //Brain Methods
    abstract public String Speak(); // to be overridden in all child classes

    public double AmericanFreedomUnits()
    {
        return weight *2.205;
    }//end method to convert weight value into pounds

    //toString method
    public String toString()
    {
        String output = "Name: " + name;
        output += "Name: " + name + "\nHasOwner: " + HasOwner;
        output += "\nAge: " + age + "\nWeight (in  KG): " + lbsToKgs();
        output += "\nFood: " + food;

        return output;
    }//end toString which is called in all child classes
}//end abstract class Pet which is parent to child classes
