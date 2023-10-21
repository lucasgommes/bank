public class Main {
    public static void main(String[] args) {
        Account cc = new ChekingAccount();
        Account cp = new SavingsAccount();
        cc.deposit(100);

        cc.showExtract();
        cp.showExtract();
    }
}