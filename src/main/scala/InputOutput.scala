import scala.io.StdIn.readLine

object InputOutput {
  def main(args: Array[String]): Unit = {
    print("Enter your name: ")
    val firstName = readLine()
    print("Enter your age: ")
    val age = readLine()
    println(s"Your name is $firstName and age is $age")
  }
}
