class BankAcc
{
    private String accNum;
    private double balance;
    private String cusName;
    private String email;
    private String phNum;

    /*public BankAcc(String accNum, double balance, String cusName, String email, String phNum)
    {
        this.accNum = accNum;
        this.balance = balance;
        this.cusName = cusName;
        this.email = email;
        this.phNum = phNum;
    }*/
    
    public void deposit(double depositMoney)
    {
        balance += depositMoney;
        System.out.println("入金額: " + depositMoney + "\t 現在の残高: " + balance);
    }

    public void withdraw(double withdrawMoney)
    {
        if (balance < withdrawMoney)
        {
            System.out.println("お金が足りない。 現在の残高: " + balance + ".");
        }
        else
        {
            balance -= withdrawMoney;
            System.out.println("出金額: " + withdrawMoney + "\t 現在の残高: " + balance + ".");
        }
    }

    public void setAccNum(String accNum)
    {
        this.accNum = accNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhNum(String phNum)
    {
        this.phNum = phNum;
    }

    public String getAccNum()
    {
        return accNum;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getCusName()
    {
        return cusName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhNum()
    {
        return phNum;
    }
}

class BankAccount
{
    public static void main(String[] args) 
    {
        //BankAcc min = new BankAcc("2150021", 8000, "min", "min@email.com", "01234567");
        BankAcc min = new BankAcc();
        min.setAccNum("2150021");
        min.setBalance(0);
        min.setCusName("min");
        min.setEmail("min@email.com");
        min.setPhNum("01234567");

        System.out.println(min.getAccNum());
        System.out.println(min.getBalance());
        System.out.println(min.getCusName());
        System.out.println(min.getEmail());
        System.out.println(min.getPhNum());

        min.withdraw(4000);

        min.deposit(5000);
        min.deposit(3000);

        min.withdraw(4000);
    }
}