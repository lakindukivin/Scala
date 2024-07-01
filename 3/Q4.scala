object integerSum extends App {

    val numbers = List(4,7,40,28,3,5);
    val sum = sumEven(numbers);

    println(s"Integer list: $numbers");
    println(s"Sum of even numbers in the list: $sum");

    def sumEven(numbers: List[Int]): Int = {
        if(numbers.isEmpty){
            0;
        }
        else{
            val head = numbers.head;
            val tail = numbers.tail;

            if(head%2 == 0){
                head + sumEven(tail);
            }
            else{
                sumEven(tail);
            }
        }
    }
}