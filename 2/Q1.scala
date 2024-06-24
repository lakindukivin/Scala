object Expressions{

    def main(args: Array[String]): Unit = {
        
        var i, j, k: Int = 2;
        var m, n: Int = 5;
        var f: Float = 12.0f;
        var g: Float = 4.0f;
        var c: Char = 'X';


        val result1 = k + 12*m;
        val result2 = m/j;
        val result3 = n%j;
        val result4 = m/j*j;
        val result5 = f+10*5+g;
        val result6 = i*n;

        println(s"k + 12*m = $result1");
        println(s"m/j = $result2");
        println(s"n%j = $result3");
        println(s"m/j*j = $result4");
        println(s"f+10*5+g = $result5");
        println(s"i*n = $result6");

        println("Java supports both pre increment (++i) and post increment (i++) operators." +
          "Scala does not support the ++ operator.");

    }
}