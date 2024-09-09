import scala.io.StdIn._

class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  override def toString: String = s"$numerator/$denominator"
}

object RationalNumber extends App {

  println("Enter the numerator: ")
  val num = readInt()

  println("Enter the denominator: ")
  val den = readInt()

  val num1 = new Rational(num, den)
  val num2 = num1.neg

  println(s"Rational number: $num1")
  println(s"Negated rational number: $num2")
}
