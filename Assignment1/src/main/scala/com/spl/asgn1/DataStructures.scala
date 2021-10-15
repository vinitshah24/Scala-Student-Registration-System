package com.spl.asgn1

object DataStructures {
  def main(args: Array[String]): Unit = {

    // Arrays = keeps order, allows duplicates, mutable
    println("Array:")
    val myArry = Array(100, "Hello", "World", 12, 3.00, 100)
    var numbers = Array(8, 5, 3, 4, 7)
    myArry(2) = "Modified"
    //Looping through an array
    for (i <- 0 to myArry.length - 1)
      print(s"${myArry(i)} ")
    for (i <- numbers) {
      println(i)
    }
    //summing an array of integers
    var sum = 0;
    //Loops through and adds all numbers in array
    for (i <- 0 to (numbers.length - 1)) {
      sum += numbers(i);
    }
    //prints sum
    println("Sum: " + sum);

    // List = keeps order, allows duplicates, immutable
    println("\nList:")
    val myList = myArry.toList
    for (i <- 0 to myList.length - 1)
      print(s"${myList(i)} ")
    val students: List[String] = List("Jay", "Vinit", "Rohit", "Prem")
    //checks to see if list is empty
    println("Check if students is empty : " + students.isEmpty)
    //prints head of students list
    println("Head of students : " + students.head)
    //prints tail of students list
    println("Tail of students : " + students.tail)

    // Set = don't preserve order, can't have duplicates
    println("\nSet:")
    val mySet = myArry.toSet
    println(mySet)
    val numSet = Set(1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    println(s"Set $numSet")
    print(s"First element: ${numSet.head}")
    println(s"Last element: ${numSet.tail}")

    // Tuple
    println("\nTuple:")
    val carProps = ("Ferrari", "F8", 2019, 280102.12)
    println(carProps)
    println(s"Car Brand: ${carProps._1}")
    println(s"Car Price: ${carProps._4}")

    // Map
    println("\nMap:")
    val myMap = Map(
      1 -> Map("Brand" -> "Tesla"),
      2 -> Map("Brand" -> "Audi"),
      3 -> Map("Brand" -> "Jaguar")
    )
    println(s"First element brand: ${myMap.get(1).get("Brand")}")
    println(s"Second element brand: ${myMap.get(2).get("Brand")}")
    println(s"Third element ${myMap.get(3)}")
  }
}
