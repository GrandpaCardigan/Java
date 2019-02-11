public class Example {
    public static void main(String[] args){
        System.out.println("We are making a pez dispenser.");
        PezDispenser dispenser = new PezDispenser("Donatello");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName()
        );
    }
}
