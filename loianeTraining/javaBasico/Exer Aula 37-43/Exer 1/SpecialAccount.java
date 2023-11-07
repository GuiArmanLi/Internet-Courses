public class SpecialAccount extends Account {
    private double limit;

    public SpecialAccount() {
    }

    public SpecialAccount(double limit) {
        this.limit = limit;
    }

    public SpecialAccount(String clientName, int accountNumber, double balance, double limit) {
        super(clientName, accountNumber, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SpecialAccount [limit=" + limit + "]";
    }

    @Override
    public void withdraw(double withdraw) {
        if (getBalance() - withdraw > -limit) {
            setBalance(getBalance() - withdraw);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
