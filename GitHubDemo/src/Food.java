public class Food{
    
    //Initializing food attributes
    private String name;

    //Constructor for Food class
    public Food(String name){
        this.name = name;
    }

    //Getter for foodName
    public String getFoodName(){
        return name;
    }

    //Setter for foodName
    public void setFoodName(String foodName){
        this.name = foodName;
    }

    @Override
    public String toString(){
        return "Food Name: " + name;
    }
}
