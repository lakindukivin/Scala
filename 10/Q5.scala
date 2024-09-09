object CountLetter extends App {

  def countOccurence(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }

  val words = List("network", "programming", "language", "mathematics")
  val totalOcc = countOccurence(words)

  println(s"Total count of letter occurrences: $totalOcc ")
}
