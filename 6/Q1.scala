import scala.io.StdIn.readInt;

object Inventory extends App {

  val inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("Gadjet1", 20, 15.50),
    102 -> ("Gadjet2", 7, 20.00),
    103 -> ("Gadjet3", 15, 17.50)
  )

  val inventory2: Map[Int, (String, Int, Double)] = Map(
    101 -> ("Gadjet1", 13, 15.00),
    103 -> ("Gadjet3", 10, 20.00),
    104 -> ("Gadjet4", 30, 40.50)
  )

  val productNames: List[String] = inventory1.values.map(_._1).toList;
  println(productNames);

  val totalValue: Double = inventory1.values.map { case (_, quantity, price) =>
    quantity * price
  }.sum;
  println(totalValue);

  val checkEmpty: Boolean = inventory1.isEmpty;
  println(s"Is inventory1 empty: $checkEmpty");

  val merge: Map[Int, (String, Int, Double)] = (inventory1 ++ inventory2).map {
    case (id, (name, quantity, price)) =>
      id -> (name, quantity + inventory2.getOrElse(id, (name, 0, 0.0))._2,
      Math.max(price, inventory2.getOrElse(id, (name, 0, 0.0))._3))
  }
  println(merge);

  println("Enter product ID to check if it exists: ");
  val id: Int = readInt();

  inventory1.get(id) match {
    case Some((name, quantity, price)) =>
      println(
        s"id = $id , Name = $name , Quantity = $quantity , Price = $price"
      );
    case None =>
      println(s"Product with id $id does not exist in inventory1");
  }

}
