public class availableCredit {
    public static void main(String[] args){
        int max_credit = 2500;
        int used_credit = 1500;
        int available_credit  = max_credit - used_credit;

        System.out.println("You currently have $" + available_credit + " available to make towards purchases.");
    }
}
