object StringFormat extends App {

  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def capitalizeLast(name: String): String = {
    if(name.isEmpty) {
      name;
    }
    else{
      val lastIndex = name.length - 1;
      val initialPart = name.substring(0, lastIndex);
      val lastChar = name.charAt(lastIndex).toString.toUpperCase;

      return initialPart + lastChar;
    }
  }

   def capitalizeSecond(name: String): String = {
    if (name.length < 2) {
      name.toUpperCase 
     }
     else{
        val firstChar = name.substring(0, 1) 
        val secondChar = name.substring(1, 2).toUpperCase 
        val restPart = name.substring(2)

        return firstChar + secondChar + restPart
    }
    }

  println(formatNames(name1)(toUpper))
  println(formatNames(name2)(capitalizeSecond))
  println(formatNames(name3)(toLower))
  println(formatNames(name4)(capitalizeLast))

}
