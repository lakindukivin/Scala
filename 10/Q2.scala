class Rationals(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  def neg: Rationals = new Rationals(-numerator, denominator)

  def sub(that: Rationals): Rationals = new Rationals(
    this.numerator * that.denominator - that.numerator * this.denominator,
    this.denominator * that.denominator
  )

  override def toString: String = s"$numerator/$denominator"
}

object RationalSum extends App {

  val x = new Rationals(3, 4)
  val y = new Rationals(5, 8)
  val z = new Rationals(2, 7)

  val result = y.sub(z)

  println(s"Rational number x: $x")
  println(s"Rational number y: $y")
  println(s"Rational number z: $z")
  println(s"Rational number y-z: $result")

}
