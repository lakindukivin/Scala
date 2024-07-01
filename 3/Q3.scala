object arithmeticMean extends App {

    val num1 = 7.5679f;
    val num2 = 8.9243f;
    val mean = findMean(num1, num2);

    println(s"Frist Number: $num1");
    println(s"Second Number: $num2");
    println(s"Average of the two numbers: $mean");

    def findMean(num1:Float, num2:Float):Float = {
        val mean = (num1 + num2)/2.0f;

        def roundDecimal(num: Float): Float = {
            val rounded = (num*100).round.toFloat / 100.0f;
            if(rounded.isNaN){
                0.0f;
            }
            else{
                rounded;
            }
        }

        roundDecimal(mean);
    }
}