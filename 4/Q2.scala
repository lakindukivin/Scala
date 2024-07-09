object Match extends App{

    println("Enter an integer: ");
    val num = scala.io.StdIn.readInt();

    val result = num match {
        case x if x == 0 => "Zero is given";
        case x if x < 0 => "Negative i given";
        case _ =>"";
    }

     val result1 = num match {
        case y if (y != 0 && y%2 == 0 )=> "Even number is given";
        case y if (y != 0 && y%2 == 1 )=> "Odd number is given";
        case _ => "";
        }
    
        println(result);
        println(result1);
}
