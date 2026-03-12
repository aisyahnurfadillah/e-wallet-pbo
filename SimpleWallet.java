class SimpleWallet{
    private String owner;
    private double balance;

    public SimpleWallet (String name, double InitialBalance) {
        this.owner = name;

        if (InitialBalance <= 0) {
            this.balance = 0;
            System.out.println("Peringatan Saldo tidak Boleh Kurang dari 0");

        } else{
            this.balance = InitialBalance;
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getBalance() {
        return "IDR" + balance;
    }

    public boolean Deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            return true;
        } else {
            System.err.println("Deposit Tidak Boleh Kurang Dari 0");
            return false;
        } 
        
    }

    public boolean Withdraw(double amount) {
        if (amount >= 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;

        } else {
            System.err.println("Withdraw Tidak Boleh Kurang Dari 0");
            return false;
        }

    }
    
    
}
