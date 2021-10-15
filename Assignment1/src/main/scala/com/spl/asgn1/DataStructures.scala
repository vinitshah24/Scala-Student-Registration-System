package com.spl.asgn1

object DataStructures {
  def main(args: Array[String]): Unit = {
    
    //Arrays
    var numbers = Array(8, 5, 3, 4, 7)
    
    //Looping through an array
    for ( i <- numbers ) {
        println(i)
    }

    //summing an array of integers
    var sum = 0;
    
    //Loops through and adds all numbers in array
    for ( i <- 0 to (numbers.length - 1)) {
        sum += numbers(i);
    }

    //prints sum
    println("Sum: " + sum);

    //Lists
    val students: List[String] = List("Jay", "Vinit", "Rohit", "Prem")

    //checks to see if list is empty
    println( "Check if students is empty : " + students.isEmpty )

    //prints head of students list
    println( "Head of students : " + students.head)

    //prints tail of students list
    println( "Tail of students : " + students.tail)

}
