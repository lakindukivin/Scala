object stringLength extends App {

    val stringList = List("Programming", "UCSC", "Scala", "Computing");
    val newList = stringFilter(stringList);

    println(s"String List: $stringList");
    println(s"Strings which has a length more than 5: $newList");

    def stringFilter(strings: List[String]): List[String] = {
        if(strings.isEmpty){
            List();
        }
        else{
            val head = strings.head;
            val tail = strings.tail;

            if(head.length > 5){
                head :: stringFilter(tail);
            }
            else{
                stringFilter(tail);
            }
        }
    }
}