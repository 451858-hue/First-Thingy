public class App {
    public static void main(String[] args) throws Exception {
        Food mice = new Food("Mice");
        Snake viper = new Snake("Green", 8, "Striped", mice, true, true);
        viper.slither(20);
        viper.eat(mice);
        viper.shedSkin("Diamonds", "Yellow");
        viper.bite();
        System.out.println(viper.toString());
    }
}
