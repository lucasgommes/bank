public abstract class Account implements IAccount{
    protected int agency;
    protected int number;
    protected double balance;
    private static final int defaultAgency = 1;
    private static int sequence = 1;

    public Account(){
        this.agency = defaultAgency;
        this.number = sequence++;
    }

    @Override
    public void getBalance(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(Account accountFinal, double value) {
        this.getBalance(value);
        accountFinal.deposit(value);
    }

    protected void viewExtract(){
        System.out.printf("Agência: %d%n", this.agency);
        System.out.printf("Número: %d%n", this.number);
        System.out.printf("Saldo: %.2f%n", this.balance);
    }
}
