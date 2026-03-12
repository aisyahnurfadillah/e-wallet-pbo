public class Main {
    public static void main(String[] args) {
        SimpleWallet wallet1 = new SimpleWallet("Dilla", 10000);

        System.out.println("saldo = " + wallet1.getBalance());

        System.out.println("owner = " + wallet1.getOwner());

        wallet1.Deposit(20000);
        System.err.println("after deposit = " + wallet1.getBalance());

        if (!wallet1.Withdraw(10000)) {
            System.err.println("withdraw failed");
        } else {
            System.err.println("withdraw success");
        }

        System.out.println(wallet1.getBalance());

    }

}
