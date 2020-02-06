public class Dog extends Pet
{
    private String breed;

    public Dog (String breed, String name, boolean HasOwner, int age, double weight, String food)
    {
        super(name, HasOwner, age, weight, food);
        this.breed = breed;
    }//end full constructor with call to super

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }
        return dailyFeedings * 30;
    }


    public String fetch()
    {
        if (Math.random() >= 0.5)
            return "Fetch accomplished";
        else
            return "No fetching here";
    }//end method that exists in Dog but not Pet to demo Polymorphism issue


    public String Speak()
    {
        if (this.age < 2)
            return "Yip";
        return "Woof";
    }//end method Speak which overrides abstract method in Pet

    public String toString()
    {
        String output = super.toString() +"\nBreed: " + breed;
        return output;
    }//end toString with call to super
}//end class Dog
