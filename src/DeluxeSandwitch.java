
public class DeluxeSandwitch extends Sandwitch {
    public DeluxeSandwitch() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addSandwitchAddition1("Chips", 2.75);
        super.addSandwitchAddition2("Drink", 1.81);
    }

    @Override
    public void addSandwitchAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addSandwitchAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addSandwitchAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addSandwitchAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
