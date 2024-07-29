import scala.io.StdIn.readLine;

object InventoryP extends App {

  def getProductList: List[String] = {
    def getProductHelper(acc: List[String]): List[String] = {
      val products = readLine("Enter product / Enter 'done' to finish: ");
      if (products.toLowerCase == "done") {
        acc;
      } else {
        getProductHelper(acc :+ products);
      }
    }
    getProductHelper(Nil);
  }

  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (productList, index) =>
      println(s"${index + 1}) $productList");
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length;
  }

  val products = getProductList;
  println("Products: ");
  printProductList(products);
  println(s"Total number of products: ${getTotalProducts(products)}");
}
