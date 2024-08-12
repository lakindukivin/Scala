import scala.io.StdIn._;

object CaesarCipher extends App {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val offset = if (char.isUpper) 'A' else 'a';
        ((char - offset + shift + 26) % 26 + offset).toChar;
      } else {
        char;
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, -shift);
  }

  def cipher(
      text: String,
      shift: Int,
      process: (String, Int) => String
  ): String = {
    process(text, shift);
  }

  println("Enter the word or sentence:");
  val inputText = readLine().trim;

  println("Enter the shift:");
  val shift = readInt();

  val encryptedText = cipher(inputText, shift, encrypt);

  println(s"Encrypted text of $inputText : $encryptedText");

  val decryptedText = cipher(encryptedText, shift, decrypt);

  println(s"Decrypted text : $decryptedText");

}
