
public class Main {
    // Temporary code to test logical working , will make changes later

    public static void main(String[] args){
        double sipResult = InvestmentPlanner.sip(5000,10,12);
        double lumpsumResult = InvestmentPlanner.lumpsum(100000,5, 10);

        System.out.println("SIP Amount: ₹ " + (int)sipResult);
        System.out.println("Lump Sum Amount: ₹ " + (int)lumpsumResult);
    }
}