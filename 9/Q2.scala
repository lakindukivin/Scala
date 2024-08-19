import scala.io.StdIn.readInt;

object NumbersCheck extends App {
  val checkNumber: Int => String = (num: Int) => {
    num match {
      case x if x <= 0     => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case _               => "Odd number is given"
    }
  }

  println("Enter an integer: ");
  val num = readInt();

  println(checkNumber(num));
}
