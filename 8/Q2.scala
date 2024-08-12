import scala.io.StdIn.readInt;

object Multiple extends App {

  println("Enter an intger: ");
  val input = readInt();

  val checkMultiple: Int => String = {
    case n if n % 15 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0  => "Multiple of Three"
    case n if n % 5 == 0  => "Multiple of Five"
    case _                => "Not a Multiple of Three or Five"
  }

  println(checkMultiple(input))

}
