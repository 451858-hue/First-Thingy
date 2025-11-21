

public class Snake {
    
    // Initializing attributes of the Snake class
    private String color;
    private int length;
    private String pattern;
    private Food favFood;
    private boolean isVenomous;
    private boolean isHungry;
    
    
    
    
    /**
     * Constructor for the Snake class
     * @param color
     * @param length
     * @param pattern
     * @param favFood
     * @param isVenomous
     * @param isHungry
     */
    public Snake(String color, int length, String pattern, Food favFood, boolean isVenomous, boolean isHungry) {
        this.color = color;
        this.length = length;
        this.pattern = pattern;
        this.favFood = favFood;
        this.isVenomous = isVenomous;
        this.isHungry = isHungry;
    }

    /**
     * Overload Constructor for the Snake class
     * @param color
     * @param length
     * @param pattern
     */
    public Snake(String color, int length, String pattern){
        this.color = color;
        this.length = length;
        this.pattern = pattern;
        this.favFood = new Food("Mice");
        this.isVenomous = false;
        this.isHungry = true;
    }

    /**
     * Second Overload Constructor for the Snake class
     */
    public Snake() {
        this.color = "red";
        this.length = 5;
        this.pattern = "striped";
        this.favFood = new Food("Mice");
        this.isVenomous = false;
        this.isHungry = true;
    }

    /**
     * Getters and Setters
     */
    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public String getPattern() {
        return pattern;
    }

    public String getfavFood() {
        return favFood.getFoodName();
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setfavFood(Food favFood) {
        this.favFood = favFood;
    }

    public void setVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    
    /**
     * Snake bites the user
     */
    public void bite(){
        System.out.println("Looks like you got bitten!");
        if(isVenomous){
            System.out.println("Oh no! The snake is venomous! Nice knowing ya!");
        } else {
            System.out.println("Phew! Thank god it's not venomous.");
        }
    }

    /**
     * Snake slithers a certain number of feet
     * @param feet
     */
    public void slither(int feet){
        System.out.println("The snake slithered " + feet + " feet forward.");
    }

    
    /**
     * Snake eats its prey to grow in length and satiate hunger or not
     * @param food
     */
    public void eat(Food food){
        if(isHungry && food != null && favFood != null && food.getFoodName().equals(favFood.getFoodName())){
            System.out.println("The snake is eating its food. It is no longer hungry.");
            isHungry = false;
            length += 2;
            System.out.println("The snake has grown! Its new length is " + length + " feet.");
        } else {
            System.out.println("The snake will eat later. The snake did not grow. It is still " + length + " feet long.");
            isHungry = true;
        }
    }

    
    /**
     * Snake sheds its skin to change pattern and color
     * @param newPattern
     * @param newColor
     */
    public void shedSkin(String newPattern, String newColor){
        System.out.println("The snake is shedding its skin!");
        pattern = newPattern;
        color = newColor;
        System.out.println("The snake now has a " + pattern + " pattern and is " + color + " in color.");
    }

    
    /**
     * Displays all the details of the snake
     */
    @Override
    public String toString(){
        return "Snake Details: \n" +
               "Color: " + color + "\n" +
               "Length: " + length + " feet\n" +
               "Pattern: " + pattern + "\n" +
               "Favorite food: " + favFood.getFoodName() + "\n" +
               "Is Venomous: " + isVenomous + "\n" +
               "Is Hungry: " + isHungry;
    }
}



