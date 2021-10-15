package com.spl.asgn1

object ConrolStructures {
  def main(args: Array[String]): Unit = {

    val movieArray = Array("Godfather", "Shawshank Redemption", "Inception", "Matrix")

    // For loop and if-else statements
    for (movie <- movieArray) {
      if (movie.length > 6) {
        println(s"Movie name length greater than 6: $movie")
      }
      else {
        println(s"Movie name length less than 6: $movie")
      }
    }

    // While loop
    var counter = 0
    while (counter < 2) {
      println(s"Count $counter: ${movieArray(counter)}")
      counter += 1
    }

    // try-catch-finally block
    try
      println(movieArray(7))
    catch
      case arrayIndexOutOfBoundsException: ArrayIndexOutOfBoundsException => {
        println(s"Caught Excpetion: $arrayIndexOutOfBoundsException")
      }
      case allOtherException: Exception => {
        println(s"Caught exception: $allOtherException")
      }
    finally
      println("Finally - End of the try catch block")

  }
}