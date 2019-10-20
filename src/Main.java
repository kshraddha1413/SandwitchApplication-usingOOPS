

public class Main {

    public static void main(String[] args) {
		

        Sandwitch sandwitch = new Sandwitch("Basic", "Sausage", 3.56, "White");
        double price = sandwitch.itemizeSandwitch();
        sandwitch.addSandwitchAddition1("Tomato", 0.27);
        sandwitch.addSandwitchAddition2("Lettuce", 0.75);
        sandwitch.addSandwitchAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + sandwitch.itemizeSandwitch());

        HealthySandwitch healthySandwitch = new HealthySandwitch("Bacon", 5.67);
        healthySandwitch.addSandwitchAddition1("Egg", 5.43);
        healthySandwitch.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthySandwitch.itemizeSandwitch());

        DeluxeSandwitch db = new DeluxeSandwitch();
        db.addSandwitchAddition3("Should not do this", 50.53);
        db.itemizeSandwitch();

    }
}
