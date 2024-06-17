object DiskArea{

  def main(args: Array[String]): Unit = {

    val radius = 5.0
    val area = getArea(radius)
    println("Area of a disk with radius " + radius + " is " + area)

  }

  def getArea(radius : Double) : Double = {
      return math.Pi * radius * radius
    }
}