import scala.io.StdIn.readDouble;

object Interest extends App {

  val calculateInterest: Double => Double = (deposit: Double) => {
    deposit match {
      case x if x <= 20000   => x * 0.02
      case x if x <= 200000  => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case x if x > 2000000  => x * 0.065
    }
  }

  print("Enter the amount to deposit: Rs.");
  val amount = readDouble();

  val interest = calculateInterest(amount);
  println(s"Interest for the amount $amount is: $interest");
}
