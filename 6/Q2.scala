import scala.io.StdIn.readLine;
import scala.util.Try;

object Students extends App {

  def getStudentInfo(
      name: String,
      marks: Int,
      totalMarks: Int
  ): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _            => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks: $marks/$totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(
      name: String,
      marks: Int,
      totalMarks: Int
  ): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks should be between 0 and total possible marks"))
    } else if (totalMarks <= 0) {
      (false, Some("Total possible marks should be a positive integer"))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentRecord: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')

    while (!validInput) {
      println("Enter student name: ")
      val name = readLine().trim

      println("Enter marks obtained: ")
      val marks = Try(readLine().toInt).getOrElse(-1)

      println("Enter total possible marks: ")
      val totalMarks = Try(readLine().toInt).getOrElse(-1)

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        studentRecord = getStudentInfo(name, marks, totalMarks)
        validInput = true
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}")
      }
    }

    return studentRecord
  }

  val studentRecord = getStudentInfoWithRetry
  printStudentRecord(studentRecord)

}
