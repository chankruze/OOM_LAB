package in.geekofia;

public class Pr14 {
    /**
     * Practical Number: 14
     * Task: Design a class to represent a bank account. Include the following:
     * => data members:
     *  - Name of the depositor
     *  - Account Number
     *  - Type of account
     *  - Balance amount in the account
     * => methods:
     *  - To assign initial values
     *  - To deposit  an amount
     *  - To withdraw an amount
     *  - To display the name and balance
     */
    private String accountHolderName, accountNumber, accountType;
    private Double balance;

    public Pr14(String accountHolderName, String accountNumber, String accountType, Double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
