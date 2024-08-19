object FormatNames extends App {

  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  val toUpper: String => String = (name: String) => name.toUpperCase;
  val toLower: String => String = (name: String) => name.toLowerCase;

  val capitalizeLast: String => String = (name: String) => {
    if (name.isEmpty) {
      name;
    } else {
      val lastIndex = name.length - 1;
      val initialPart = name.substring(0, lastIndex);
      val lastChar = name.charAt(lastIndex).toString.toUpperCase;
      initialPart + lastChar;
    }
  }

  val capitalizeSecond: String => String = (name: String) => {
    if (name.length < 2) {
      name.toUpperCase;
    } else {
      val firstChar = name.substring(0, 1);
      val secondChar = name.substring(1, 2).toUpperCase;
      val restPart = name.substring(2);
      firstChar + secondChar + restPart;
    }
  }

  val formatNames: (String, String => String) => String =
    (name: String, format: String => String) => format(name);

  println(formatNames(name1, toUpper));
  println(formatNames(name2, capitalizeSecond));
  println(formatNames(name3, toLower));
  println(formatNames(name4, capitalizeLast));
}
