import scala.io.StdIn.readLine;

object numberFilter extends App {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(x => x % 2 == 0);
  }

  println("Enter a list of integers:");
  val input = readLine();

  val numbers = input.split(" ").map(_.toInt).toList;

  val evenNumbers = filterEvenNumbers(numbers);

  println(s"Even numbers: ${evenNumbers.mkString(" ")}");
}
