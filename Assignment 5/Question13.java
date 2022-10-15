/*
Q13> Create an Abstract class 'Accounts' with the following details:
 * Data Members: (a)Balance (b)accountNumber (c)accountHoldersName (d)address
 * Methods: (a)withdrawal() -> abstract (b)deposit() -> abstract (c)display() -> to show balance of the account number

Create a subclass of this class SavingsAccount and add the following details:
 * Data Members: (a)rateOfInterest
 * Methods: (a)calculateAmount
 */

import java.io.*;

abstract class Accounts{
    double Balance;
    long accountNumber;
    String accountHoldersName = new String();
    String address = new String();

    Accounts(long ac, String name, double bal, String add)
    {
        accountNumber = ac;
        Balance = bal;
        accountHoldersName = name;
        address = add;
    }

    abstract void withdrawal(double d);
    abstract void deposit(double d);

    void display()
    {
        System.out.println("Available balance: " + Balance);
    }
}

class SavingsAccount extends Accounts{
    final double rateOfInterest = 3.5;

    SavingsAccount(long ac, String name, double bal, String add)
    {
        super(ac, name, bal, add);
    }
    @Override
    void withdrawal(double amt)
    {
        super.Balance -= amt;
    }

    @Override
    void deposit(double amt)
    {
        super.Balance += amt;
    }

    void calculateAmount()
    {
        super.Balance += (rateOfInterest / 100) * super.Balance;
    }
}

public class Question13{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = new String();
        long acn;
        double b, a;
        String add = new String();
        int ch;

        System.out.println("Enter Account Number: ");
        acn = Long.parseLong(br.readLine());

        System.out.println("Enter Name: ");
        n = br.readLine();

        System.out.println("Enter Address: ");
        add = br.readLine();

        System.out.println("Enter Initial Amount: ");
        b = Double.parseDouble(br.readLine());

        SavingsAccount ob = new SavingsAccount(acn, n, b, add);
        while (true)
        {
            System.out.println("1. Deposit\n2. Withdraw\n3. Display Balance\n0. Exit");
            System.out.println("Enter your choice: ");

            ch = Integer.parseInt(br.readLine());
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Amount: ");
                    a = Double.parseDouble(br.readLine());
                    ob.deposit(a);
                    break;

                case 2:
                    System.out.println("Enter Amount: ");
                    a = Double.parseDouble(br.readLine());
                    ob.withdrawal(a);
                    break;

                case 3:
                    ob.calculateAmount();
                    ob.display();
                    break;

                case 0:
                    System.out.println("Thank, You.\nPlease visit again.");
                    System.exit(0);

                default:
                    System.out.println("Your input is wrong.\nTry again.");
            }
        }
    }
}

/*
Output:
Enter Account Number:
5239578033
Enter Name:
Yorrichi Tsugikuni
Enter Address:
Sengoku Area
Enter Initial Amount:
500000
1. Deposit
2. Withdraw
3. Display Balance
0. Exit
Enter your choice:
1
Enter Amount:
1000000
1. Deposit
2. Withdraw
3. Display Balance
0. Exit
Enter your choice:
3
Available balance: 1552500.0
1. Deposit
2. Withdraw
3. Display Balance
0. Exit
Enter your choice:
0
Thank, You.
Please visit again.
 */
