object VolumeSphere{

    def main(args: Array[String]): Unit = {

        val radius = 5.0
        val volume = getVolume(radius)
        println(s"Volume of a Sphere with a radius of $radius is $volume")

    }

    def getVolume(radius: Double): Double = {
        4.0/3 * math.Pi * radius * radius * radius
    }
}