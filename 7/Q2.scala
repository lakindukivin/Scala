import scala.io.StdIn.readLine;

object numberSquare extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * x);
  }

  println("Enter a list of integers:");
  val input = readLine();

  val numbers = input.split(" ").map(_.toInt).toList;

  val squareNumbers = calculateSquare(numbers);

  println(s"${squareNumbers.mkString(" ")}");
}
