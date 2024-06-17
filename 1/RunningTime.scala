object RunningTime{

    def main(args: Array[String]): Unit = {

        val easyPace = 8.0
        val tempoPace = 7.0

        val easyD1 = 2.0
        val tempoD1 = 3.0
        val easyD2 = 2.0

        val easyT1 = getTime(easyD1, easyPace)
        val tempoT1 = getTime(tempoD1, tempoPace)
        val easyT2 = getTime(easyD2, easyPace)

        val totalTime = easyT1 + tempoT1 + easyT2
        println(s"The total running time is $totalTime minutes.")
    }

    def getTime(time: Double, pace: Double): Double = {
        time * pace
    }

}