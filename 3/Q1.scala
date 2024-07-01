object reverseString extends App {

    val string1 = "Scala Programming";
    val string2 = stringReverse(string1);

    println(s"Normal string: $string1");
    println(s"Reversed: $string2");

    def stringReverse(string: String): String = {
        if(string.isEmpty){
            "";
        }
        else{
            stringReverse(string.tail) + string.head;
        }
    }

}