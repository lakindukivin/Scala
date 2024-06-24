object Salary{

    def main(args: Array[String]): Unit = {

        val perHour = 250;
        val perOT = 85;
        val taxRate = 0.12f;

        val hours = 40;
        val otHours = 30;

        val takeHomeSalary = calculateSalary(perHour, perOT, hours, otHours, taxRate);

        println(s"Take home salary of Employee is $takeHomeSalary");

    }

    def calculateSalary(perHour: Int, perOT: Int, hours: Int, otHours: Int, taxRate: Float ): Float = {
        (hours*perHour + otHours*perOT) * ( 1 - taxRate);
    }
}