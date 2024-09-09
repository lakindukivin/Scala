class Account(var balance: Double) {

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

  def transfer(amount: Double, target: Account): Unit = {
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

object BankAccount extends App {
  val account1 = new Account(5000.00)
  val account2 = new Account(10000.00)

  println(s"Account 1 $account1")
  println(s"Account 2 $account2 \n")

  account1.deposit(1000.00)
  account2.withdraw(2000.00)
  account1.transfer(500.00, account2)

  println(s"Account 1 final $account1")
  println(s"Account 2 final $account2 \n")
}
