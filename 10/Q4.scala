class Accounts(var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive\n")
    balance += amount
    println(
      s"Deposited LKR ${amount.formatted("%.2f")}. " +
        s"New balance is LKR ${balance.formatted("%.2f\n")}"
    )
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positve\n")
    if (amount > balance) {
      println(s"Cannot withdraw the amount LKR ${amount
          .formatted("%.2f")}. Current balance: LKR ${balance.formatted("%.2f")} \n")
    } else {
      balance -= amount
      println(s"Successfully withdrew LKR ${amount
          .formatted("%.2f")}. Remaining balance: LKR ${balance.formatted("%.2f")}\n")
    }
  }

  def transfer(amount: Double, target: Accounts): Unit = {
    require(amount > 0, "Deposit amount must be positive\n")
    if (amount > balance) {
      println(s"Cannot transfer the amount LKR ${amount
          .formatted("%.2f")}. Current balance: LKR ${balance.formatted("%.2f")} \n")
    } else {
      this.withdraw(amount)
      target.deposit(amount)
      println(s"Successfully transferred LKR ${amount
          .formatted("%.2f")}. Remaining balance: LKR ${balance.formatted("%.2f")}\n")
    }
  }

  override def toString: String =
    s"Current balance: LKR ${balance.formatted("%.2f")}"
}

object Bank {
  var accounts: List[Accounts] = List()

  def negBalance: List[Accounts] = accounts.filter(_.balance < 0)

  def totalBalance: Double = accounts.map(_.balance).sum

  def interest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05
      } else {
        account.balance += account.balance * 0.10
      }
    }
  }
}

object BankAccounts extends App {
  val account1 = new Accounts(3000.00)
  val account2 = new Accounts(4000.00)
  val account3 = new Accounts(-5000.00)
  val account4 = new Accounts(6000.00)
  val account5 = new Accounts(-7000.00)

  Bank.accounts = List(account1, account2, account3, account4, account5)

  println("Initial balances of the accounts")
  Bank.accounts.foreach(println)

  println("\nAccounts with negative balances: ")
  Bank.negBalance.foreach(println)

  val total = Bank.totalBalance
  println(s"\nTotal balance of all accounts: LKR ${total.formatted("%.2f")}")

  Bank.interest()
  println("\nBalances after applying interests: ")
  Bank.accounts.foreach(println)
}
