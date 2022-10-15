/*
Q13> Create an Abstract class 'Accounts' with the following details:
 * Data Members: (a)Balance (b)accountNumber (c)accountHoldersName (d)address
 * Methods: (a)withdrawal() -> abstract (b)deposit() -> abstract (c)display() -> to show balance of the account number

Create a subclass of this class SavingsAccount and add the following details:
 * Data Members: (a)rateOfInterest
 * Methods: (a)calculateAmount
 */

abstract class Accounts{
    double Balance;
    int accountNumber = 329745612;
    String accountHoldersName = "Yorrichi Tsugikuni", address = "Roy Bahadur Road";

    abstract public double withdrawal();
    abstract public double deposit();
    public void display(double Balance, int accountNumber)
    {
        System.out.println("Balance in the account number " + this.accountNumber + " : " + this.Balance);
    }
}

class SavingsAccount extends Accounts{
    double rateOfInterest = 13;

    @Override
    public double deposit()
    {
        return 0;
    }

    @Override
    public double withdrawal()
    {
        return 0;
    }

    public double calculateAmount()
    {
        return 0;
    }
}

public class Question13 {
}
