public interface IAccount {
    void getBalance(double value);
    void deposit(double value);
    void transfer(Account accountFinal, double value);
    void showExtract();
}
