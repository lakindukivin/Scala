import scala.io.StdIn.readLine;

object primeFilter extends App {

  def Prime(num: Int): Boolean = {
    if (num <= 1) false;
    else if (num == 2) true;
    else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0);
  }

  def filterPrimeNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(x => Prime(x));
  }

  println("Enter a list of integers:");
  val input = readLine();

  val numbers = input.split(" ").map(_.toInt).toList;

  val primeNumbers = filterPrimeNumbers(numbers);

  println(s"Prime numbers: ${primeNumbers.mkString(" ")}");
}
