
object Inventory extends App{

    val names = Array("Apple", "Banana", "Orange", "Pineapple", "Grape");
    val nums = Array(20, 40, 25, 10, 60);

    println(displayInventory());

    println(restockItem("Apple", 10));

    println(restockItem("Guava", 20));

    println(sellItem("Banana", 30));
    
    println(sellItem("Orange", 40));

    def displayInventory():String = {

        var result = "";
        for(i <- 0 until names.length){
            val result1 = s"${names(i)} = ${nums(i)}";
            result += result1 + "\n";
        }
        result;
    }

    def restockItem(name: String, num: Int): String = {

        var found = false;
        for(i <- 0 until names.length){
            if(name == names(i)){
                nums(i) += num;
                found = true;
            }
        }  
        if(!found){
            println(s"Item $name not found");
        }
            displayInventory();
    }

     def sellItem(name: String, num: Int): String = {

        var found = false;
        var enough = false;

        for(i <- 0 until names.length){
            if(name == names(i)){
                found = true;

                if(nums(i) >= num){
                    enough =  true;
                }

                if(enough){
                nums(i) -= num;
                }
            }
        }  
        if(!found){
            println(s"Item $name not found");
        }
        if(!enough){
            println(s"Item $name does not have enough quantity to sell");
        }
            displayInventory();
    }

    


}