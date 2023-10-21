public class ChekingAccount extends Account{
    @Override
    public void showExtract() {
        System.out.println("### Extrato Conta Corrente ###");
        viewExtract();
    }
}
