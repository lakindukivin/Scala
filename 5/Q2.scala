case class Book(title: String, author: String, ISBN: String);

object Library extends App {

  var library: Set[Book] = Set(
    Book("Lord of the Rings", "R.R. Tolkien", "12345"),
    Book("Harry Potter", "J.K.Rowling", "23456"),
    Book("Song of Ice and Fire", "George R. R. Martin", "34567")
  )

  def addBook(book: Book): Unit = {
    library += book;
    println(s"Book '${book.title}' added\n");
  }

  def removeBook(ISBN: String): Unit = {
    val size = library.size;
    library = library.filterNot(_.ISBN == ISBN);
    if (library.size < size) {
      println(s"Book with ISBN $ISBN removed\n");
    } else {
      println(s"No book found with ISBN $ISBN \n");
    }
  }

  def checkBook(ISBN: String): Unit = {
    val exist = library.exists(_.ISBN == ISBN);
    if (exist) {
      println(s"Book with ISBN '$ISBN' exists\n");
    } else {
      println(s"Book with ISBN '$ISBN' does not exist\n");
    }
  }

  def displayLibrary(): Unit = {
    println("Books available in the library: ");
    library.foreach { book =>
      println(
        s"Title: ${book.title}  Author: ${book.author},  ISBN: ${book.ISBN}"
      );
    }
  }

  def searchBook(title: String): Unit = {
    val found = library.find(_.title.equalsIgnoreCase(title));
    found match {
      case Some(book) =>
        println(
          s"Title: ${book.title}, Author: ${book.author} ISBN: ${book.ISBN}"
        )
      case None =>
        println(s"Book with title '$title' does not exist\n")
    }
  }

  def authorBooks(author: String): Unit = {
    val books = library.filter(_.author.equalsIgnoreCase(author));
    if (books.nonEmpty) {
      println(s"Books written by $author: ");
      books.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.ISBN}")
      }
    } else {
      println(s"No books found by author $author");
    }
  }

  displayLibrary();

  val newBook = Book("The Hobbit", "R.R. Tolkien", "45678");
  addBook(newBook);

  val removeISBN = "12345";
  removeBook(removeISBN);

  displayLibrary();

  val checkISBN = "34567";
  checkBook(checkISBN);

  val searchTitle = "Song of Ice and Fire";
  searchBook(searchTitle);

  val authorName = "R.R. Tolkien";
  authorBooks(authorName);

}
