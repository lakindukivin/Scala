object temperature{

    def main(args: Array[String]): Unit = {

        val temp = 35.0
        val fTeamp = convert(temp)
        println(s"Temperature $temp C in Fahrenheit is $fTeamp")
    }

    def convert(temp: Double): Double = {
        temp * 1.8000 + 32.00
    }
}