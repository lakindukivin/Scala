object BookCost{

    def main(args: Array[String]): Unit = {

        val initCost = 24.95
        val num = 60
        val dRate = 0.4
        val shipCost = calculateShipCost(num)
        val totalCost = calculateTotalCost(initCost, dRate, num, shipCost)
        println(s"Total wholesale cost for $num copies of books is $totalCost")
    }

    def calculateShipCost(num: Int): Double = {
        val shipPerBook = 3
        val aShipPerBook = 0.75

        if(num > 50){
            50*shipPerBook + (num -50)*aShipPerBook
        }
        else{
            num*shipPerBook
        }
    }

    def calculateTotalCost(initCost: Double, dRate: Double, num: Int, shipCost: Double): Double = {
        initCost * num* (1 - dRate) + shipCost 
    }
}