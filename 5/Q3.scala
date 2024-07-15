object Fibonacci extends App {

  def fibonacci(n: Int): Int = {
    n match {
      case x if x <= 0 => 0;
      case x if x == 1 => 1;
      case default     => fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  def printSequence(n: Int): Unit = {
    def sequence(x: Int): Unit = {
      if (x < n) {
        println(fibonacci(x))
        sequence(x + 1);
      }
    }

    sequence(0);
  }

  val n = 8;
  println(s"First $n fibonacchi numbers: ");
  printSequence(n);

}
