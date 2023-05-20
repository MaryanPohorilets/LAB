public class ExtendedBankAccount extends BankAccount {
    private double interestRate;
    private String accountType;

    public ExtendedBankAccount(String name, int accountNumber, double balance, double interestRate, String accountType) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.accountType = accountType;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Процентна ставка: " + interestRate);
        System.out.println("Тип рахунку: " + accountType);
    }
}

